package com.kiran.lld.tictactoe.models;

public class HumanPlayer extends Player {
    private User user;

    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }

    @Override
    public BoardCell makeMove(Board borad){

    }
}
