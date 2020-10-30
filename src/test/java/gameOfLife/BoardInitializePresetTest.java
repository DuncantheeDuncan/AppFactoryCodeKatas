package gameOfLife;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoardInitializePresetTest {


    String rmRed = "\u001B[31m";
    String rmRst = "\u001B[0m";
    String red, reset;


    @DisplayName("The grid should change state after initializing")
    @Test
    void shouldTestTheStateOfTheBoardAfterAssigningState() {

        AssignGridState assignGridState = new AssignGridState();
        Board b = new Board();


        StringBuilder firstState = new StringBuilder();
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


        assignGridState.assignGridState();
        String initializedBoard = String.valueOf(firstState);
        String presetL = b.gridBox();


        if (presetL.contains(rmRed)) { // removing color elements

            red = presetL.replace(rmRed, "");
            reset = red.replace(rmRst, "");
            presetL = reset;
        }


        assertEquals(presetL, initializedBoard);
        assertTrue(presetL.contains(initializedBoard));

    }
}
