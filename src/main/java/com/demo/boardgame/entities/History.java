package com.demo.boardgame.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="history_id")
    private String historyId;

    @Column(name="game_name")
    private String gameName;

    @Column(name = "play_date")
    private String playDate;
}
