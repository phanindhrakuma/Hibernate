package com.telsuko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


//session1cache first we fetch the data from database that will save in the cache if we again request that same dat again that will give the data using cache not go to the database  

public class App 
{
    public static void main( String[] args )
    {

        Alien a = new Alien();
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session1 = sf.openSession();
        session1.beginTransaction();

        a = (Alien)session1.get(Alien.class, 101);
        System.out.println(a);
        a = (Alien)session1.get(Alien.class, 101);  // we are calling the same dat again so it will not file any query to fetch the dat it will use from cache
        System.out.println(a);
        session1.getTransaction().commit();
        session1.close();


        Session session2 = sf.openSession();
        session2.beginTransaction();

        a = (Alien)session2.get(Alien.class, 101); // if we use another session2 and requesting for same data we already fetch in session1 but again the session2 call the database and and filing the query and fetching the data
        // so the cache will store session to session and that will only store one cache that is called first leven cache if the session changed the first leve cache is also changed 
        System.out.println(a);
        
        session2.getTransaction().commit();
        session2.close();
    }
}
