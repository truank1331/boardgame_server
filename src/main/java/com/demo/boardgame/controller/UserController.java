package com.demo.boardgame.controller;

import com.demo.boardgame.entities.BoardGame;
import com.demo.boardgame.entities.User;
import com.demo.boardgame.repositories.BoardgameRepository;
import com.demo.boardgame.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo3")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "")
    public String index()throws Exception{
        List<User> boardgames = userRepository.findAll();
        System.out.println(boardgames);
        return "boardgames";
    }

    @GetMapping(value = "/test1")
    public List<User> test1() throws Exception {
        return userRepository.findAllByQuery();
    }


}
