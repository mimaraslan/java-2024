package com.mimaraslan;

import com.mimaraslan.entity.Address;
import com.mimaraslan.entity.Customer;
import com.mimaraslan.entity.Worker;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Mehmet","Aydın");
        customer1.setCreateDate(new Date());





        //customer1.setAddress("Ankara Ayrancı");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Süleyman");
        customer2.setLastName("Kesik");
        //customer2.setAddress("İstanbul Esenler");
        customer2.setCreateDate(new Date());


    //    System.out.println(customer1);
    //    System.out.println(customer2);


   //     System.out.println(customer1.getId() +  " " + customer1.getFirstName() + " " + customer1.getLastName());
   //     System.out.println(customer2.getId() +  " " + customer2.getFirstName() + " " + customer2.getLastName());


        Worker worker1 = new Worker();
        worker1.setFirstName("Serdar");
        worker1.setLastName("Çırak");
        worker1.setCreateDate(new Date());
        worker1.setAge(25);
        worker1.setEmail("aaaaa@bbb.com");

        Address address1 = new Address();
        address1.setCountry("Türkiye");
        address1.setCity("Ankara");
        address1.setState("Ayrancı");
        address1.setZipCode("06123");

        worker1.setAddress(address1);




        Address address2 = new Address();
        address2.setCountry("Türkiye");
        address2.setCity("Antalya");
        address2.setState("Kaş");
        address2.setZipCode("07999");

        customer1.setAddress(address2);




        customer2.setAddress( new Address("Almanya", "Köln", "Merkez", "49123" ) );




        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
                session.save(customer1);
                session.save(customer2);
                session.save(worker1);
            transaction.commit();

        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
        } finally {
            session.close();
        }



    }
}
