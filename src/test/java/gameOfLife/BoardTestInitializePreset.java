package gameOfLife;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static gameOfLife.Board.grid;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoardTestInitializePreset {

    Board b;
    private AssignGridState assignGridState;
    private StringBuilder firstState;


    String rmRed = "\u001B[31m";
    String rmRst = "\u001B[0m";
    String red, reset;


    @BeforeEach
    void setup() {

        assignGridState = new AssignGridState();
        b = new Board();


        firstState = new StringBuilder();
        firstState.append(
                "\n[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][1][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                        "[0][0][0][0][1][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
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
                        "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]"
        );

    }

    @AfterEach
    void tearDown() {


        assignGridState = null;
        b = null;


    }


    @DisplayName("The grid should change state after initializing")
    @Test
    void shouldTestTheStateOfTheBoardAfterAssigningState() {

        assignGridState.assignGridState();
        String initializedBoard = String.valueOf(firstState);
        String presetL = b.toString();


        if (presetL.contains(rmRed)) { // removing color elements

            red = presetL.replace(rmRed, "");
            reset = red.replace(rmRst, "");
            presetL = reset;
        }


        assertEquals(presetL, initializedBoard);
        assertTrue(presetL.contains(initializedBoard));

    }
}
