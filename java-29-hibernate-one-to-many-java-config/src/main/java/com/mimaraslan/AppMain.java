package com.mimaraslan;

import com.mimaraslan.entity.Customer;
import com.mimaraslan.entity.Order;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Mehmet","Aydın");

        Customer customer2 = new Customer();
        customer2.setFirstName("Süleyman");
        customer2.setLastName("Kesik");



        Order order1 = new Order();
        order1.setProduct("Portakal");
        order1.setCode("111");
        order1.setAmount(BigDecimal.valueOf(50.25));
        order1.setCreateDate(new Date());

        Order order2 = new Order();
        order2.setProduct("Elma");
        order2.setCode("222");
        order2.setAmount(BigDecimal.valueOf(10.33));
        order2.setCreateDate(new Date());

        Order order3 = new Order();
        order3.setProduct("Üzüm");
        order3.setCode("333");
        order3.setAmount(BigDecimal.valueOf(60.11));
        order3.setCreateDate(new Date());


        customer1.getOrders().add(order1);
        customer1.getOrders().add(order2);

        order1.setCustomer(customer1);
        order2.setCustomer(customer1);


        customer2.getOrders().add(order3);
        order3.setCustomer(customer2);




        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
                session.save(customer1);
                session.save(customer2);

                session.save(order1);
                session.save(order2);
                session.save(order3);
            transaction.commit();

        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
        } finally {
            session.close();
        }



    }
}
