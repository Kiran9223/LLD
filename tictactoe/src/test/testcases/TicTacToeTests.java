import com.kiran.lld.tictactoe.models.Board;

public class TicTacToeTests {
    @Test
    public void testCreateGame() {
        
    }

    @Test
    public void testCreateBoard() {
        Board b = new Board(3);
        assertEquals(3, b.getCells().get(0).size(),
            "If the ctor of board is called with n, it should create n rows"
        );
    }
    
}
