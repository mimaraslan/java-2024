package com.mimaraslan.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static ServiceRegistry serviceRegistry;

    static{

        try{
            Configuration configuration=new Configuration();
            configuration.configure();

            serviceRegistry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            configuration.buildSessionFactory(serviceRegistry);

        }catch(Exception e){
            System.err.println("Exception : "+e);
        }

    }

    public static SessionFactory getSessionFactory(){
        return new Configuration().configure().buildSessionFactory();
    }

}