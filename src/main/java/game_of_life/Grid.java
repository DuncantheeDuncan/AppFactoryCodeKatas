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


    int[][] assignState = {{4, 3},{5,3},{2,4},{2,2}};

    public void printBoard() {
        int incr = 0;

        int xux = assignState[0][0] = 50;
        System.out.println("uhu " + xux);
        for (int r = 0; r < grid.length; r++) {
            StringBuilder line = new StringBuilder();

            for (int c = 0; c < grid.length; c++) {


                for (int d=0;d<assignState.length;d++){
                    for (int e=0 ;e<assignState[d].length;e++) {
                        System.out.println(d +" - "+e);

                    }
                }

//                if ()

                    grid[c][r] = (int) Math.floor(Math.random() * 2);// assign specific values
//                grid[c][r] = (int) Math.floor(Math.random() * 2);// assigns random numbers
                line.append("[").append(grid[c][r]).append("]");// assign empty arrays
            }
            System.out.println("col" + incr + " " + line);
            incr++;
        }
    }

    public static void main(String[] args) {


        Grid xAndY = new Grid();
        Grid board = new Grid();


        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {

//                board.getNextGen(grid);

                if (y == xAndY.yAxis & x == xAndY.xAxis) {
//
//                    // starting point
                    grid[x][y] = 1;
                    System.out.println("position " + grid[x][y]);
//
                    System.out.println("left" + board.left());
//
                    board.topLeft();
//
                    board.top();
//
                }
//                else {
//                    grid[x][y] = 0;
//
//                }
//

            }

            board.right();

            board.topRight();

            board.bottomRight();

            board.bottom();

            board.bottomLeft();

        }


        board.printBoard();


    }
}




