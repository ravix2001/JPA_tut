package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App
{
    public static void main( String[] args )
    {
        //Get data from database
        /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Alien alien = em.find(Alien.class, 1);

        System.out.println(alien);*/

        //Persist(save) data into database
        Alien a = new Alien();
        a.setId(5);
        a.setName("Anish");
        a.setTech("Engineering");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println(a);
    }
}
