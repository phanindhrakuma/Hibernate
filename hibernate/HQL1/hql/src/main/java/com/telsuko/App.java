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
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        int b = 60; // use this when  // BELOW WE CAN USE THE CONCATITION using 
        session.beginTransaction();

        // Random r = new Random();

        
        // for(int i=2;i<50;i++){
        //     Student student = new Student();
        //     student.setRollno(i);
        //     student.setAnme("name"+i);  // for inserting the data to the tabel 
        //     student.setMarks(r.nextInt(100));
        //     session.save(student);
        // }


        // THE BELOW IS THE FETCHING THE DAT USING HQL

        // Query q1 = session.createQuery("from Student"); // select * from students 


        // Query q1 = session.createQuery("from Student where marks > 50");
        // List<Student> students = q1.list();

        // for(Student s: students){
        //     System.out.println(s);
        // }


        //The BELOW  WE ARE FETCHING 

        // Query q1 = session.createQuery("from Student where rollno=7");
        // Student student = (Student)q1.uniqueResult();
        // System.out.println(student);

        //THE BELOW WE ARE USING THE HQL QUERY USING (select) in that query so it will return the object not like student all like above 
        
        // Query q1 = session.createQuery("select rollno,marks,anme from Student where rollno=7");
        // Object[] students = (Object[])q1.uniqueResult();

        // for(Object o: students){
        //     System.out.println(o);
        // }

        // THE BELOW WE WILL USE THE QUERY  USING (SELECT) SO IT WILL GIVE THE OUTPUT LIKE LIST

        // 
        
        // BELOW WE CAN USE THE CONCATITION

        // Query q1 = session.createQuery("select sum(marks) from Student where marks>"+b);  // use this without qq1.setParameter
        Query q1 = session.createQuery("select sum(marks) from Student where marks>:b");
        q1.setParameter("b", b);

        Long marks = (Long)q1.uniqueResult();
        System.out.println(marks);

       


        session.getTransaction().commit();
        session.clear(); 
        sf.close();
    }
}
