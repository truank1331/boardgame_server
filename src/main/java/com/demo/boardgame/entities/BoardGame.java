package com.demo.boardgame.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="boardgame")
public class BoardGame {
    @Id
    @Column(name="game_name")
    private String gameName;

    @Column(name="thai_name")
    private String thaiName;

    @Column(name="price")
    private float price;

    @Column(name="picture_url")
    private String pictureUrl;

    @Column(name = "buy_date")
    private String buyDate;
}
