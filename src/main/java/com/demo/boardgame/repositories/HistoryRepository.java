package com.demo.boardgame.repositories;

import com.demo.boardgame.entities.BoardGame;
import com.demo.boardgame.entities.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Integer> {
        @Query(value = "SELECT * FROM history;", nativeQuery = true)
        public List<History> findAllByQuery();

        @Query(value = "select history.play_date, score.history_id, score.username, score.point from score JOIN history on history.history_id=score.history_id WHERE history.game_name=\"Splendor\" ORDER BY score.history_id ASC;", nativeQuery = true)
        public List<String> findHistoryScore(String gameName);

}
