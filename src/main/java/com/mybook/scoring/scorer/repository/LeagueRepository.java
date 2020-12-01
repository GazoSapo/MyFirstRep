package com.mybook.scoring.scorer.repository;

import com.mybook.scoring.scorer.domain.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends JpaRepository<League, Integer> {
}
