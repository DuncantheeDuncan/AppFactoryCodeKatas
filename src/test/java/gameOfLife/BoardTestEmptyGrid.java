package gameOfLife;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoardTestEmptyGrid {

    Board b;
    private StringBuilder initialState;


    @BeforeEach
    void setup() {
        initialState = new StringBuilder();
        b = new Board();

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
    }

    @AfterEach
    void tearDown() {
        initialState = null;
        b = null;
    }


    @DisplayName("Should print the initial state of the grid")
    @Test
    void shouldTestEmptyGrid() {// TODO: 2020/10/28 fix the update method

        String emptyBoard = b.toString();
        String initialStateOfABoard = String.valueOf(initialState);

        assertTrue(initialStateOfABoard.contains(emptyBoard));
        assertEquals(emptyBoard, initialStateOfABoard);
    }
}
