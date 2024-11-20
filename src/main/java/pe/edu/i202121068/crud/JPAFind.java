package pe.edu.i202121068.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202121068.entity.Country;

public class JPAFind {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CL1");
        EntityManager em = emf.createEntityManager();

        Country peru = em.find(Country.class, "PER");
        if (peru != null) {
            // Imprimir nombres de las ciudades con población > 700k
            peru.getCities()
                    .stream()
                    .filter(city -> city.getPopulation() > 700000)
                    .forEach(city -> System.out.println(city.getName()));
        } else {
            System.out.println("El país con código 'PER' no fue encontrado.");
        }
    }
}
