package pe.edu.i202121068.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageId id;
    private String IsOfficial;
    private double Percentage;
    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
    @MapsId("countryCode")
    @JoinColumn (name = "CountryCode")
    private Country country;

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "id=" + id +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                ", country=" + country +
                '}';
    }

    public CountryLanguage() {
    }

    public CountryLanguage(CountryLanguageId id, String isOfficial, double percentage, Country country) {
        this.id = id;
        IsOfficial = isOfficial;
        Percentage = percentage;
        this.country = country;
    }

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        Percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
