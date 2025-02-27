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
    @SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Laptop l = new Laptop();

        // l.setLid(106);
        // l.setBrand("apple");
        // l.setPrice(700);
        // session.save(l);
        // l.setPrice(650);

        // THE BELOW WE ARE USING DETACH

        l.setLid(107);
        l.setBrand("SONY");
        l.setPrice(800);
        session.save(l);
        l.setPrice(1000); // after saveing also if we assign the data we will save in the database

        session.getTransaction().commit();

        session.detach(l);
        l.setPrice(2222); // we will detach after commit afer detach if we dd any data that will not assign ti the database 
        session.clear(); 
        sf.close();
    }
}
