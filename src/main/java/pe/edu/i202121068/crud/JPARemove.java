package pe.edu.i202121068.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202121068.entity.Country;

public class JPARemove {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CL1");
        EntityManager em = emf.createEntityManager();
        Country country = em.find(Country.class, "Abc");
        em.getTransaction().begin();
        em.remove(country);
        em.getTransaction().commit();
    }
}
