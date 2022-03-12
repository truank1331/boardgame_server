package com.demo.boardgame.controller;

import com.demo.boardgame.entities.BoardGame;
import com.demo.boardgame.entities.History;
import com.demo.boardgame.repositories.BoardgameRepository;
import com.demo.boardgame.repositories.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo1")
public class HistoryController {
    @Autowired
    private HistoryRepository historyRepository;

    @GetMapping(value = "")
    public String index()throws Exception{
        List<History> boardgames = historyRepository.findAll();
        System.out.println(boardgames);
        return "historyRepository";
    }

    @GetMapping(value = "/test1")
    public List<History> test1() throws Exception {
        return historyRepository.findAllByQuery();
    }


}
