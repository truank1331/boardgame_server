package com.demo.boardgame.repositories;

import com.demo.boardgame.entities.BoardGame;
import com.demo.boardgame.entities.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History,Integer> {
    @Query(
            value = "SELECT * FROM history;",
            nativeQuery = true)
    public List<History> findAllByQuery();
}
