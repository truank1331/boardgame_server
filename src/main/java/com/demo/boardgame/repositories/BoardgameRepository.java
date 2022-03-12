package com.demo.boardgame.repositories;

import com.demo.boardgame.entities.BoardGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardgameRepository extends JpaRepository<BoardGame,Integer> {
    @Query(
            value = "SELECT * FROM boardgame;",
            nativeQuery = true)
    public List<BoardGame> findAllByQuery();
}
