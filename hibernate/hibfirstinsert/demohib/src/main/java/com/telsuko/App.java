package com.telsuko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
        Alien telsuko = new Alien();
        telsuko.setAid(102);
        telsuko.setAname("phani");
        telsuko.setColor("blue");

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(telsuko);

        tx.commit();
        session.clear(); 
        sf.close();
    }
}
