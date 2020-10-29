package gameOfLife;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class BoardTest {

    String rmRed = "\u001B[31m";
    String rmRst = "\u001B[0m";
    String red, reset;


    @DisplayName("The grid should change state to its first generation")
    @Test
    void shouldTestTheStateOfTheBoardToTFirstGeneration() {
        Board b = new Board();
        AssignGridState assignGridState = new AssignGridState();


        assignGridState.assignGridState();
        String firstGen =
                "\n[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][1][1][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][1][1][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
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
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]";


        String firstState = b.updateBoard(1);// does not count initial state as 1

        if (firstState.contains(rmRed)) { // removing color elements
            red = firstState.replace(rmRed, "");
            reset = red.replace(rmRst, "");
            firstState = reset;
        }

        assertEquals(firstState, firstGen);
        assertTrue(firstState.contains(firstGen));

    }
}