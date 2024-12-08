package com.mimaraslan.dao;

import com.mimaraslan.model.Buyer;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BuyerDAO {
    
    public void saveOrUpdateBuyer(Buyer buyer){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(buyer);
            transaction.commit();
        } catch (HibernateError e) {

            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println("HibernateError : " + e.getMessage());
        } finally {
            session.close();
        }
    }




    public Buyer getBuyerFindById(Long id){

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return  session.get(Buyer.class, id);
        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
            return null;
        } finally {
            session.close();
        }

    }

    public List<Buyer> getBuyerFindAll(){

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return  session.createQuery("from Buyer").list();

        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
            return null;
        } finally {
            session.close();
        }

    }

    public boolean deleteBuyerFindById(Long id){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Buyer buyer = session.get(Buyer.class, id);

            if(buyer != null){
                session.delete(buyer);
                System.out.println("Buyer deleted");
                transaction.commit();
                return true;
            } else {
                System.out.println("Buyer not found");
                return false;
            }

        } catch (HibernateError e) {

            if (transaction != null) {
                transaction.rollback();
            }

            System.out.println("HibernateError : " + e.getMessage());
            return false;
        } finally {
            session.close();
        }

    }

}


