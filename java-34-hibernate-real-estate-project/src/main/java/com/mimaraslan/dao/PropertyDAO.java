package com.mimaraslan.dao;

import com.mimaraslan.model.Property;
import com.mimaraslan.util.HibernateUtil;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

    public class PropertyDAO {

        public void saveOrUpdateProperty(Property property){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();
                session.saveOrUpdate(property);
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




        public Property getPropertyFindById(Long id){

            Session session = HibernateUtil.getSessionFactory().openSession();

            try {
                return  session.get(Property.class, id);
            } catch (HibernateError e) {
                System.out.println("HibernateError : " + e.getMessage());
                return null;
            } finally {
                session.close();
            }

        }

        public List<Property> getPropertyFindAll(){

            Session session = HibernateUtil.getSessionFactory().openSession();

            try {
                return  session.createQuery("from Property").list();

            } catch (HibernateError e) {
                System.out.println("HibernateError : " + e.getMessage());
                return null;
            } finally {
                session.close();
            }

        }

        public boolean deletePropertyFindById(Long id){

            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();

                Property property = session.get(Property.class, id);

                if(property != null){
                    session.delete(property);
                    System.out.println("Property deleted");
                    transaction.commit();
                    return true;
                } else {
                    System.out.println("Property not found");
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


