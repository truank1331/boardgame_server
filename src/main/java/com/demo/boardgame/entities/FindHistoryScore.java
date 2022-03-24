package com.demo.boardgame.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
public class FindHistoryScore {
    private String play_date;
    private String history_id;
    private String username;
    private Float point;
}