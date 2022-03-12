package com.demo.boardgame.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="score")
public class Score {
    @Id
    @Column(name="history_id")
    private String historyId;

    @Column(name="username")
    private String username;

    @Column(name="point")
    private int price;

    @Column(name = "is_win")
    private boolean isWin;

    @Column(name="details")
    private String details;
}
