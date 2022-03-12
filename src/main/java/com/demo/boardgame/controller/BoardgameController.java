package com.demo.boardgame.controller;

import com.demo.boardgame.entities.BoardGame;
import com.demo.boardgame.repositories.BoardgameRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/demo")
public class BoardgameController {
    @Autowired
    private BoardgameRepository boardgameRepository;

    @GetMapping(value = "")
    public String index()throws Exception{
        List<BoardGame> boardgames = boardgameRepository.findAll();
//        System.out.println(boardgames);
        return "boardgames";
    }

    @GetMapping(value = "/test1")
    public List<BoardGame> test1() throws Exception {
        return boardgameRepository.findAllByQuery();
    }


}
