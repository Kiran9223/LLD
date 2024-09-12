package com.kiran.lld.tictactoe.strategies.playing;

import com.kiran.lld.tictactoe.models.Board;
import com.kiran.lld.tictactoe.models.BoardCell;

public interface PlayingStrategy {
    BoardCell makeMove(Board board);
}
