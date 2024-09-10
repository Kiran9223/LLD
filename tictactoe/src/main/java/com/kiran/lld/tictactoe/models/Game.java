package com.kiran.lld.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private GameStatus status;

}
