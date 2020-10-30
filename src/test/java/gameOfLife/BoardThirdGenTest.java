package gameOfLife;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BoardThirdGenTest {

    String rmRed = "\u001B[31m";
    String rmRst = "\u001B[0m";
    String red, reset;


    @DisplayName("The grid should change state to its third generation")
    @Test
    void shouldTestTheStateOfTheBoardToThirdGeneration() {
        Board b = new Board();
        AssignGridState assignGridState = new AssignGridState();


        assignGridState.assignGridState();
        String thirdSgGen = "\n[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                "[0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                "[0][0][0][0][1][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                "[0][0][0][1][0][1][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                "[0][0][0][1][0][1][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
                "[0][0][0][0][1][0][0][0][0][0][0][0][0][0][0][0][0][0]\n" +
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

        String thirdState = b.updateBoard(3);


        if (thirdState.contains(rmRed)) { // removing color elements
            red = thirdState.replace(rmRed, "");
            reset = red.replace(rmRst, "");
            thirdState = reset;
        }


        assertEquals(thirdState, thirdSgGen);
        assertTrue(thirdState.contains(thirdSgGen));

    }

}
