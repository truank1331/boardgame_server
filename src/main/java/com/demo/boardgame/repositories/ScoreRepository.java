package com.demo.boardgame.repositories;

import com.demo.boardgame.entities.BoardGame;
import com.demo.boardgame.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score,Integer> {
    @Query(
            value = "SELECT * FROM score;",
            nativeQuery = true)
    public List<Score> findAllByQuery();
}
