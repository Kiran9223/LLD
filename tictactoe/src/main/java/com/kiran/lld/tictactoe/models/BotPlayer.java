package com.kiran.lld.tictactoe.models;

import com.kiran.lld.tictactoe.strategies.playing.PlayingStrategy;


public class BotPlayer extends Player {
    private GameLevel level;
    private PlayingStrategy playingStrategy;

    public BotPlayer(GameSymbol symbol, GameLevel level, PlayingStrategy playingStrategy) {
        super(symbol);
        this.level = level;
        this.playingStrategy = playingStrategy;
    }

    @Override
    public BoardCell makeMove(Board board) {
        return playingStrategy.makeMove(board);
    }
}
