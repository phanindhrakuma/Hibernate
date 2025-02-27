package com.telsuko;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // THE BELOW IS FETCHING THE VALUE
        // EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");  // here we have tio enter the xml file persistance name to connect with database
        // EntityManager em = emf.createEntityManager();

        // Alien a = em.find(Alien.class, 4);  // 4 is the primary key
        // System.out.println(a);

        //THE BELOW IS INSERTING THE VALUES 

        Alien a = new Alien();
        a.setRollno(50);
        a.setMarks(56);
        a.setAnme("phani");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");  // here we have tio enter the xml file persistance name to connect with database
        EntityManager em = emf.createEntityManager();

        //for saving

        em.getTransaction().begin();  // the transaction must be begin to to save the data in database 

        em.persist(a); // it is saved

        em.getTransaction().commit(); 
        System.out.println(a);

    }
}
