package com.mybook.scoring.scorer.service;

import com.mybook.scoring.scorer.domain.Team;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TeamService {

    List<Team> getAllTeams();

    List<String> getTeamsCities();

    Optional<Team> getSingleTeam(Integer id);

}
