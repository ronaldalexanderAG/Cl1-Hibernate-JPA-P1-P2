package pe.edu.i202121068.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202121068.entity.City;
import pe.edu.i202121068.entity.Country;
import pe.edu.i202121068.entity.CountryLanguage;
import pe.edu.i202121068.entity.CountryLanguageId;

import java.util.Arrays;

public class JPAPersist {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CL1");
        EntityManager em = emf.createEntityManager();
        //pais
        Country country = new Country("Abc","Nuevo",
                "Asia","nueva",20.2,150,
                321654987,80.5,20.0,20.0,"A",
                "A","B",651321,"98",null,null);

        //ciudades
        City city = new City("Nueva",country,"nuevo",6841);
        City city1 = new City("Nueva1",country,"nuevo",6841);
        City city2 = new City("Nueva2",country,"nuevo",6841);

        //leguanje
        //CountryLanguageId llave = new CountryLanguageId("Abc","1");
        CountryLanguage lenguaje1 = new CountryLanguage( new CountryLanguageId("Abc","1"),"T",50.0,country);
        CountryLanguage lenguaje2 = new CountryLanguage( new CountryLanguageId("Abc","2"),"T",50.0,country);

        country.setCities(Arrays.asList(city,city1,city2));
        country.setLanguages(Arrays.asList(lenguaje1,lenguaje2));
        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();

    }
}
