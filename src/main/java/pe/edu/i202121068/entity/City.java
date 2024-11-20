package pe.edu.i202121068.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(nullable = false)
    private String Name;

    @ManyToOne (cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn (name = "CountryCode")
    private Country country;


    @Column(nullable = false)
    private String District;
    @Column(nullable = false)
    private int Population;

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", country=" + country +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }

    public City() {
    }

    public City(String name, Country country, String district, int population) {
        Name = name;
        this.country = country;
        District = district;
        Population = population;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }
}
