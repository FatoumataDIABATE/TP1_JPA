package fr.epsib32526;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        try(
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager()
        ) {

            em.getTransaction().begin();

            Personne personne = new Personne ("D", "Fatou", 22);
            em.persist(personne);

            em.getTransaction().commit();
        }
    }

}