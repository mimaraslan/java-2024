package com.mimaraslan;

import com.mimaraslan.entity.Employee;
import com.mimaraslan.entity.Owner;
import com.mimaraslan.entity.Person;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {


        Person person1 = new Person("Sefa","Küçükarslan");
        person1.setAddress("Adana");
       // person1.setPersonId(1L);


        Employee employee1 = new Employee("Serdar","Çırak", "Ankara",
                "1111", "abc@gmail.com",
                10000, new Date(), 1453L);
        employee1.setEmployeeId(1L);


        Owner owner1 = new Owner("Volkan","Kaytmaz","İzmir",
               "Project Manager" );
        // owner1.setOwnerId(1L);



        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();

                session.persist(person1);
                session.flush(); //  transaction arasında oluğu kadarını say kaydet.

                session.persist(owner1);
                session.flush();

                session.persist(employee1);
                session.flush();

            transaction.commit();

        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
        } finally {
            session.close();
        }



    }
}
