package com.demo.boardgame.controller;

import com.demo.boardgame.entities.History;
import com.demo.boardgame.repositories.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/history")
public class HistoryController {
    @Autowired
    private HistoryRepository historyRepository;

    @GetMapping(value = "")
    public String index()throws Exception{
        List<History> boardgames = historyRepository.findAll();
        System.out.println(boardgames);
        return "historyRepository";
    }

    @GetMapping(value = "/list")
    public List<History> list() throws Exception {
        return historyRepository.findAllByQuery();
    }

    @GetMapping(value = "/getScoreChartList")
    public List<History> getScoreChartList() throws Exception{
        return historyRepository.findHistoryScore("Splendor");
    }


}
