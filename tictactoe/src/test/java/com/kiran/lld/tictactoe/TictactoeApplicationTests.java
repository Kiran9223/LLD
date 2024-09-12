package com.kiran.lld.tictactoe;

import com.kiran.lld.tictactoe.models.Board;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TictactoeApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateGame() {

	}

	@Test
	public void testCreateBoard() {
		Board b = new Board(3, 3);
		assertEquals(3, b.getCells().get(0).size(),
				"If the ctor of board is called with n, it should create n rows"
		);
	}

}
