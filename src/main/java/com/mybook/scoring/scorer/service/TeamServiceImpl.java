package com.mybook.scoring.scorer.service;

import com.mybook.scoring.scorer.domain.City;
import com.mybook.scoring.scorer.domain.Team;
import com.mybook.scoring.scorer.repository.CityRepository;
import com.mybook.scoring.scorer.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public List<String> getTeamsCities() {

        List<Team> teams = teamRepository.findAll();
        List<City> cit = cityRepository.findAll();

        List<String> cities = new ArrayList<>();

        for (int i= 0 ; i < teams.size() -1 ; i++) {

        // cities.add(teams.get(i).getCity().getCityName());
            cities.add(cit.get(i).getCityName());
        }

        return cities;
    }

    @Override
    public Optional<Team> getSingleTeam(Integer id) {
        return teamRepository.findById(id);
    }
}
