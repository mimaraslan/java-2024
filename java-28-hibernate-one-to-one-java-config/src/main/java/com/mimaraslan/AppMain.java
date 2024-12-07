package com.mimaraslan;

import com.mimaraslan.entity.Customer;
import com.mimaraslan.entity.CustomerDetail;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Mehmet","Aydın");

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


        CustomerDetail customerDetail2 = new CustomerDetail();
        customerDetail2.setAddress("İstanbul");
        customerDetail2.setPhone("222222222222");
        customerDetail2.setEmail("bbbbb@gmail.com");
        customerDetail2.setCreateDate(new Date());

        customerDetail2.setCustomer(customer2);

        customer2.setCustomerDetail(customerDetail2);





        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
                session.save(customer1);
                session.save(customer2);
            transaction.commit();

        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
        } finally {
            session.close();
        }



    }
}
