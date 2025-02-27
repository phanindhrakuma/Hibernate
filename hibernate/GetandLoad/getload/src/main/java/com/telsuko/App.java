package com.telsuko;


import java.util.*;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.sql.*;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        // Laptop lap = session.get(Laptop.class, 105);
        // System.out.println(lap);  // by using get it will file the query or hit the database if we not use the print statement but Load will not file it without print statement

        // @SuppressWarnings("deprecation")
        // Laptop lap = session.load(Laptop.class, 105);  // by using load it will not hit the database without print statement  
        // System.out.println(lap);

        @SuppressWarnings("deprecation")
        Laptop lap = session.load(Laptop.class, 105);  // by using load it will not hit the database without print statement  
        Thread.sleep(3000); // we can see it stop 3 seconds and then the query will file and hit the dtabase 
        System.out.println(lap);

        
        session.getTransaction().commit();
        session.clear(); 
        sf.close();
    }
}
