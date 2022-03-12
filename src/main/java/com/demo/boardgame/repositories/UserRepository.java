package com.demo.boardgame.repositories;

import com.demo.boardgame.entities.BoardGame;
import com.demo.boardgame.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(
            value = "SELECT * FROM user;",
            nativeQuery = true)
    public List<User> findAllByQuery();
}
