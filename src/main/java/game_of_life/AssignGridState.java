package game_of_life;

import static game_of_life.Board.grid;

public class AssignGridState {
    int[][] assignState = {{4, 3}, {4, 4}, {4, 2}, {5, 4}};

    public void assignGridState() {
        int aliveCells = 0;// todo get this
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
}
