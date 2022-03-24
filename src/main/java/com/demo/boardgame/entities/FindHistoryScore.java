package com.demo.boardgame.entities;

import lombok.Data;

import javax.persistence.*;

@Data
public class FindHistoryScore {
    @Column(name = "play_date")
    private String playDate;

    @Column(name = "history_Id")
    private String historyId;

    @Column(name = "username")
    private String username;

    @Column(name = "point")
    private Float point;
}