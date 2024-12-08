package com.mimaraslan;

import com.mimaraslan.entity.Customer;
import com.mimaraslan.entity.CustomerDetail;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Mehmet","Aydın");
        customer1.setAge((short) 30);

        CustomerDetail customerDetail1 = new CustomerDetail();
        customerDetail1.setAddress("Ankara");
        customerDetail1.setPhone("111111111");
        customerDetail1.setEmail("aaaa@gmail.com");
        customerDetail1.setCreateDate(new Date());


        customerDetail1.setCustomer(customer1);

        customer1.setCustomerDetail(customerDetail1);



        Customer customer2 = new Customer();
        customer2.setFirstName("Süleyman");
        customer2.setLastName("Kesik");
        customer2.setAge((short) 25);


        CustomerDetail customerDetail2 = new CustomerDetail();
        customerDetail2.setAddress("İstanbul");
        customerDetail2.setPhone("222222222222");
        customerDetail2.setEmail("bbbbb@gmail.com");
        customerDetail2.setCreateDate(new Date());

        customerDetail2.setCustomer(customer2);

        customer2.setCustomerDetail(customerDetail2);




        Customer customer3 = new Customer();
        customer3.setFirstName("Cihan");
        customer3.setLastName("Çelik");
        customer3.setAge((short) 23);


        CustomerDetail customerDetail3 = new CustomerDetail();
        customerDetail3.setAddress("Berlin");
        customerDetail3.setPhone("333333333");
        customerDetail3.setEmail("ccccc@gmail.com");
        customerDetail3.setCreateDate(new Date());

        customerDetail3.setCustomer(customer3);

        customer3.setCustomerDetail(customerDetail3);





        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
                session.save(customer1);
                session.save(customer2);
                session.save(customer3);
            transaction.commit();


            transaction = session.beginTransaction();

            System.out.println("================= SELECT ======================");

            Query query = session.createQuery("from Customer");

            List<Customer> customers = query.list();

            System.out.println("SIZE : " + customers.size());

            for (Customer customer : customers) {
                System.out.println(customer.getFirstName() + " " + customer.getLastName());
            }

            System.out.println("================= SELECT WHERE ======================");

            query = session.createQuery("FROM Customer WHERE customerId = 3");

            customers = query.list();

            for (Customer customer : customers) {
                System.out.println(customer.getCustomerId() + " " + customer.getFirstName() + " " + customer.getLastName());
            }


            System.out.println("================= SELECT WHERE ======================");


            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter customerId : ");

            String customerId = myObj.nextLine();  // Read user input
            System.out.print ("customerId: " + customerId);  // Output user input



            query = session.createQuery("FROM Customer WHERE customerId = :customerId")
                    .setParameter("customerId", customerId );

            customers = query.list();



            System.out.println("\nInfo record : " + customers.size());

            if (customers.size() > 0) {

                for (Customer customer : customers) {
                    System.out.println(customer.getCustomerId() + " " + customer.getFirstName() + " " + customer.getLastName());
                }

            } else {
                System.out.println("No customers found");
            }




            System.out.println("================= SELECT DELETE ======================");


            myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter customerId : ");

            customerId = myObj.nextLine();  // Read user input
            System.out.print ("customerId: " + customerId);  // Output user input



            // FIXME  müsşteriyi silince detayının da silinmesini istiyoruz.
            //   query = session.createQuery("DELETE FROM Customer  WHERE customerId = :customerId")
           //          .setParameter("customerId", customerId );

            query = session.createQuery("DELETE FROM CustomerDetail  WHERE customerDetailId = :customerId")
                      .setParameter("customerId", customerId );

            int queryResult = query.executeUpdate();

            System.out.println("queryResult: " + queryResult);



            System.out.println("\nInfo record : " + customers.size());

            if (customers.size() > 0) {

                for (Customer customer : customers) {
                    System.out.println(customer.getCustomerId() + " " + customer.getFirstName() + " " + customer.getLastName());
                }

            } else {
                System.out.println("No customers found");
            }





            System.out.println("================= COUNT ======================");


            query = session.createQuery("SELECT COUNT(*) FROM Customer");

            long countResult = (long) query.uniqueResult();
            System.out.println("queryResult: " + countResult);





            System.out.println("=================  COUNT MAX MIN SUM COUNT AVG  ======================");

            // FIXME yazdırmak için uğraş

            Query<Long> countQuery = session.createQuery("SELECT COUNT (*) FROM Customer", Long.class);
            Long countAge = countQuery.getSingleResult();
            System.out.println("Count Age: " + countAge);



            Query<Short> maxQuery = session.createQuery("SELECT MAX(c.age) FROM Customer c", Short.class);
            Short maxAge = maxQuery.getSingleResult();
            System.out.println("Maximum Age: " + maxAge);


            Query<Short> minQuery = session.createQuery("SELECT MIN(c.age) FROM Customer c", Short.class);
            Short minAge = minQuery.getSingleResult();
            System.out.println("Min Age: " + minAge);


            Query<Long> sumQuery = session.createQuery("SELECT SUM(c.age) FROM Customer c", Long.class);
            Long sumAge = sumQuery.getSingleResult();
            System.out.println("Sum Age: " + sumAge);


            Query<Double> avgQuery = session.createQuery("SELECT AVG(c.age) FROM Customer c", Double.class);
            Double avgAge = avgQuery.getSingleResult();
            System.out.println("Avg Age: " + avgAge);


            System.out.println("================= JOIN ======================");
/*

SELECT * FROM
TableA A        JOIN         TableB B
ON  A.id = B.id


SELECT * FROM
companydb.customers c      INNER JOIN       companydb.customer_details d
ON  c.CUSTOMER_ID = d.CUSTOMER_DETAIL_ID;


SELECT * FROM
Customer c      INNER JOIN      CustomerDetail d
ON  c.customerId = d.customerDetailId;

*/


            query = session.createQuery("SELECT c.firstName, c.lastName, d.email, d.phone  FROM  " +
                                     "Customer c      INNER JOIN      CustomerDetail d " +
                                     "ON  c.customerId = d.customerDetailId");


            List<Object> objectList = query.list();


            System.out.println("SIZE : " + customers.size());

            // FIXME sorgu sonucunu yazdır
            System.out.println(objectList);


            transaction.commit();

        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
        } finally {
            session.close();
        }



    }
}
