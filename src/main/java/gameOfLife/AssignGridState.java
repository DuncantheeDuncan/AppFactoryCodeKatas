package gameOfLife;

import static gameOfLife.Board.grid;

public class AssignGridState {

    //    private int[][] assignState = {{0, 1}, {0, 2}, {0, 3}}; // stroke |
    private final String presetName = "lShape";
    private int[][] assignState = Presets.valueOf(presetName).preset;
    private int aliveCells = 0;


    public void assignGridState() {
        aliveCells = 0;
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {

                int count = 0, getX = 0, getY = 0;

                for (int d = 0; d < assignState.length; d++) {
                    for (int e = 0; e < assignState[d].length; e++) {
                        count++;

                        if (count == 1) {
                            getX = assignState[d][e];
                        } else if (count == 2) {
                            getY = assignState[d][e];
                            count = 0;
                            break;
                        }
                    }

                    if (y == getY & x == getX) {
                        grid[x][y] = 1;
                        aliveCells++;
                    }
                }
            }
        }
    }

    public int getAliveCells() {
        return aliveCells;
    }

    public void setAssignState(int[][] assignState) {
        this.assignState = assignState;
    }
}
