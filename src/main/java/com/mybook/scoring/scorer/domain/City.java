package com.mybook.scoring.scorer.domain;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @Column(name = "id_city")
    private Integer idCity;

    @Column(name = "city_name")
    private String cityName;

   @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "countryID", referencedColumnName = "id_country")
    private Country country;

    public City() {
    }

    public City(int idCity, String cityName, Country country) {
        this.idCity = idCity;
        this.cityName = cityName;
        this.country = country;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountryID() {
        return country;
    }

    public void setCountryID(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "idCity=" + idCity +
                ", cityName='" + cityName + '\'' +
                ", countryID=" + country +
                '}';
    }


}
