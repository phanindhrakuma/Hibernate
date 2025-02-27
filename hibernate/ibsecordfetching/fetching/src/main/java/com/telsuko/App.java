package com.telsuko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
       Alien telsuko = new Alien();
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();

       Transaction tx = session.beginTransaction();
       telsuko = (Alien)session.get(Alien.class, 102);
       tx.commit();
       System.out.println(telsuko);
       session.clear();
       sf.close();
       
    }
}
