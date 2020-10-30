package gameOfLife;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static gameOfLife.Board.grid;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoardEmptyGridTest {


    @DisplayName("Should print the initial state of the grid")
    @Test
    void shouldTestEmptyGrid() {


        StringBuilder initialState = new StringBuilder();
        Board b= new Board();
        b.gridBox();

        initialState.append(// 18 * 18
                "\n[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]"
        );

        String emptyBoard = b.gridBox();
        System.out.println(emptyBoard);
        String initialStateOfABoard = String.valueOf(initialState);

        assertTrue(initialStateOfABoard.contains(emptyBoard));
        assertEquals(emptyBoard, initialStateOfABoard);


    }
}
