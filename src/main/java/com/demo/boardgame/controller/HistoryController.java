package com.demo.boardgame.controller;

import com.demo.boardgame.entities.FindHistoryScore;
import com.demo.boardgame.entities.History;
import com.demo.boardgame.repositories.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/history")
public class HistoryController {
    @Autowired
    private HistoryRepository historyRepository;

    @GetMapping(value = "")
    public String index() throws Exception {
        List<History> boardgames = historyRepository.findAll();
        System.out.println(boardgames);
        return "historyRepository";
    }

    @GetMapping(value = "/list")
    public List<History> list() throws Exception {
        return historyRepository.findAllByQuery();
    }

    @GetMapping(value = "/getScoreChartList/{gameName}")
    public List<String> getScoreChartList(@PathVariable String gameName) throws Exception {
        System.out.println("************"+historyRepository.findHistoryScore(gameName)+"************");
        return historyRepository.findHistoryScore(gameName);
    }

}
