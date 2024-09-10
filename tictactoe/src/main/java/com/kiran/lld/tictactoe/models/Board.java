package com.kiran.lld.tictactoe.models;

import java.util.ArrayList;
import java.util.Collections;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Board {
    private int size;
    private List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int size){
        this.size = size;
        this.cells = initializeCells(size);
    }

    private List<List<BoardCell>> initializeCells(int size) {
        List<BoardCell> firstRow =  Collections.nCopies(size, new BoardCell());
        return Collections.nCopies(size, firstRow);
    }
}
