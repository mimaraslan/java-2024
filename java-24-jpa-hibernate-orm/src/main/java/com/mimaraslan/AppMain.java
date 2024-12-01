package com.mimaraslan;

import com.mimaraslan.entity.Customer;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Mehmet","Aydın");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Süleyman");
        customer2.setLastName("Kesik");

    //    System.out.println(customer1);
    //    System.out.println(customer2);


   //     System.out.println(customer1.getId() +  " " + customer1.getFirstName() + " " + customer1.getLastName());
   //     System.out.println(customer2.getId() +  " " + customer2.getFirstName() + " " + customer2.getLastName());

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
