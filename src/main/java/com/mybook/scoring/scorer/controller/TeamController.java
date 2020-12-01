package com.mybook.scoring.scorer.controller;

import com.mybook.scoring.scorer.domain.Team;
import com.mybook.scoring.scorer.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class TeamController {

    @Autowired
    TeamService teamService;


    @GetMapping("/team")
    public Iterable<Team> getAllTeams() {

        return teamService.getAllTeams();
    }

    @GetMapping("/team/{id}")
    public Optional<Team> getSingleTeam(@PathVariable Integer id) {

        return teamService.getSingleTeam(id);
    }

    @GetMapping("/cities")
    public Iterable<String> getCities() {

        return teamService.getTeamsCities();
}

}
