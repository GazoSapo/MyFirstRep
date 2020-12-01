package com.mybook.scoring.scorer.domain;


import javax.persistence.*;

@Entity
@Table(name = "league")
public class League {

    @Id
    @Column(name = "id_league")
    private Integer leagueId;

    @Column(name = "league_name")
    private String leagueName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "countryID", referencedColumnName = "id_country")
    private Country country;

    @Column(name = "number_of_teams")
    private int numberOfTeams;

    public League() {
    }

    public League(Integer leagueId, String leagueName, Country country, int numberOfTeams) {
        this.leagueId = leagueId;
        this.leagueName = leagueName;
        this.country = country;
        this.numberOfTeams = numberOfTeams;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    @Override
    public String toString() {
        return "League{" +
                "leagueId=" + leagueId +
                ", leagueName='" + leagueName + '\'' +
                ", country=" + country.getCountryCode() +
                ", numberOfTeams=" + numberOfTeams +
                '}';
    }
}
