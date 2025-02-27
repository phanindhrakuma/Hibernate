package com.telsuko;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(Laptops.class).addAnnotatedClass(Aliens.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Aliens a1 = session.get(Aliens.class, 1);

        System.out.println(a1.getAname());

        // Collection<Laptops> laps = a1.getLaps();

        // for(Laptops l: laps){
        //     System.out.println(l);
        // }

        session.getTransaction().commit();
        session.clear(); 
        sf.close();
    }
}
