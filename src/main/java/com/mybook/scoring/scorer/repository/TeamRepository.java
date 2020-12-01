package com.mybook.scoring.scorer.repository;

import com.mybook.scoring.scorer.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    List<Team> findAll();

    @Query(value = "SELECT t FROM Team t")
    List<Team> findAllWithLeague();

    Optional<Team> findById(Integer id);
}
