package game_of_life;


class Grid {

    public static int[][] grid = new int[8][8];

    int yAxis = 3;
    int xAxis = 5;


    public int left() {

        return grid[xAxis - 1][yAxis];
    }

    public int topLeft() {

        return grid[xAxis - 1][yAxis - 1];
    }

    public int top() {

        return grid[xAxis][yAxis - 1];
    }

    public int right() {

        return grid[xAxis + 1][yAxis];
    }

    public int topRight() {
        return grid[xAxis + 1][yAxis - 1];
    }

    public int bottomRight() {
        return grid[xAxis + 1][yAxis + 1];
    }

    public int bottom() {
        return grid[xAxis][yAxis + 1];
    }

    public int bottomLeft() {

        return grid[xAxis - 1][yAxis + 1];
    }

    public int[][] getNextGen(int[][] grid) {

        int[][] nextGrid = new int[grid.length][];


        for (int i = 0; i < grid.length; i++) {
            nextGrid[i] = new int[grid.length];

            for (int j = 0; j < grid.length; j++) {
                int value = grid[xAxis][yAxis];// current value

                int neighbours = 0; // FIXME: 2020/10/20 how to calculate neighbours?

                if (value == 0 && neighbours == 3) {

                    nextGrid[i][j] = 1;
                } else if (value == 1 && (neighbours < 2 || neighbours > 3)) {
                    nextGrid[i][j] = 0;
                } else {
                    nextGrid[i][j] = value;
                }

            }
        }

        return nextGrid;
    }


    int[][] assignState = {{4, 3}, {4, 4}, {4, 2},{5, 4}};


    public void printBoard() {
        int increment = 0;

        for (int r = 0; r < grid.length; r++) {
            StringBuilder line = new StringBuilder();
            for (int[] ints : grid) {

                line.append("[").append(ints[r]).append("]");// assign empty arrays
            }

            System.out.println("col" + increment + " " + line);
            increment++;
        }
    }


    public static void main(String[] args) {

        Grid board = new Grid();

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {

                int count = 0, getX = 0, getY = 0;

                for (int d = 0; d < board.assignState.length; d++) {
                    for (int e = 0; e < board.assignState[d].length; e++) {
                        count++;

                        if (count == 1) {
                            getX = board.assignState[d][e];
                        } else if (count == 2) {
                            getY = board.assignState[d][e];
                            count = 0;
                            break;
                        }
                    }

                    if (y == getY & x == getX) grid[x][y] = 1; // grid starts counting from 0

                    // TODO: 2020/10/21  count the neighbours for each cell

//                    board.left();
//                    board.topLeft();
//                    board.top();


                }
            }

//            board.right();
//            board.topRight();
//            board.bottomRight();
//            board.bottom();
//            board.bottomLeft();

        }


        board.printBoard();


    }
}




