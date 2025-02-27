package com.telsuko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    @SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");

        Students student = new Students();
        student.setAnme("phani");
        student.setRollno(1);
        student.setMarks(56);
        // student.setLaptop(laptop); // for one to one
        student.getLaptop().add(laptop);
        laptop.getStudent().add(student);

        Configuration con = new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        session.save(laptop);
        session.save(student);

        session.getTransaction().commit();
        session.clear(); 
        sf.close();

        //Note : before executing the one to many you run this commands in the mysql workbench 
        /*
         * show tables;

        drop table students;
        drop table laptop;
        drop table students_laptop;
         */

         //Note in one to many the both dables dont knwo about the eachother 
        
    }
}
