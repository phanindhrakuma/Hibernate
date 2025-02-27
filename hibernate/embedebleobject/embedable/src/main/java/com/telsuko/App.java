package com.telsuko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    @SuppressWarnings("deprecation")
    public static void main( String[] args )
    {

        AlienName an = new AlienName();
        an.setFname("phanindhra kumar");
        an.setLname("Batthula");
        an.setMname("venumadhav");


        Alien telsuko = new Alien();
        telsuko.setAid(101);
        telsuko.setColor("black");
        telsuko.setAname(an);
        

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(telsuko);
        tx.commit();
        System.out.println(telsuko);
        session.clear();
        sf.close();
        


    }
}
