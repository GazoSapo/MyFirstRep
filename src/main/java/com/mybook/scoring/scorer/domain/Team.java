package com.mybook.scoring.scorer.domain;



import javax.persistence.*;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @Column(name = "id_team")
    private Integer idTeam;

    @Column(name = "team_name")
    private String teamName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityID", referencedColumnName = "id_city")
    private City city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "countryID", referencedColumnName = "id_country")
    private Country country;

    @OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "leagueID", referencedColumnName = "id_league")
    private League league;

    @Column(name = "number_of_players")
    private Integer numberOfPlayers;

    public Team() {
    }

    public Team(int idTeam, String teamName, City city, Country country, League league, int numberOfPlayers) {
        this.idTeam = idTeam;
        this.teamName = teamName;
        this.city = city;
        this.country = country;
        this.league = league;
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "idTeam=" + idTeam +
                ", teamName='" + teamName + '\'' +
                ", cityID='" + city.getCityName() + '\'' +
                ", countryID='" + country + '\'' +
                ", leagueID='" + league.getLeagueName() + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                '}';
    }

}


