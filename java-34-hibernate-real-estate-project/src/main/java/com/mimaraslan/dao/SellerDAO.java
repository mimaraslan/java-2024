package com.mimaraslan.dao;

import com.mimaraslan.model.Seller;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SellerDAO {

    public void saveOrUpdateSeller(Seller seller){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(seller);
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




    public Seller getSellerFindById(Long id){

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return  session.get(Seller.class, id);
        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
            return null;
        } finally {
            session.close();
        }

    }

    public List<Seller> getSellerFindAll(){

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            return  session.createQuery("from Seller").list();

        } catch (HibernateError e) {
            System.out.println("HibernateError : " + e.getMessage());
            return null;
        } finally {
            session.close();
        }

    }

    public boolean deleteSellerFindById(Long id){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Seller seller = session.get(Seller.class, id);

            if(seller != null){
                session.delete(seller);
                System.out.println("Seller deleted");
                transaction.commit();
                return true;
            } else {
                System.out.println("Seller not found");
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


