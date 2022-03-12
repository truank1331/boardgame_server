package com.demo.boardgame.controller;

import com.demo.boardgame.entities.BoardGame;
import com.demo.boardgame.entities.Score;
import com.demo.boardgame.repositories.BoardgameRepository;
import com.demo.boardgame.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo2")
public class ScoreController {
    @Autowired
    private ScoreRepository scoreRepository;

    @GetMapping(value = "")
    public String index()throws Exception{
        List<Score> boardgames = scoreRepository.findAll();
        System.out.println(boardgames);
        return "boardgames";
    }

    @GetMapping(value = "/test1")
    public List<Score> test1() throws Exception {
        return scoreRepository.findAllByQuery();
    }


}
