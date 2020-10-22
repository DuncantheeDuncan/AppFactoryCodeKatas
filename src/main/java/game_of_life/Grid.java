package game_of_life;


class Grid {

    public static int[][] grid = new int[8][8];

//    int yAxis = 3;
//    int xAxis = 5;

//    int x, y;

    public int left(int x, int y, int[][] grid) {


//        System.out.println("left cell " + grid[x - 1][y]);
        return grid[x - 1][y];
    }

    public int top(int x, int y, int[][] grid) {

//        System.out.println("top cell " + grid[x][y - 1]);
        return grid[x][y - 1];
    }


    public int topLeft(int x, int y, int[][] grid) {

//        System.out.println("top left "+ grid[x -1][y-1]);
        return grid[x - 1][y - 1];
    }


    public int right(int x, int y, int[][] grid) {

//        System.out.println("right "+ grid[x +1][y]);
        return grid[x + 1][y];
    }

    public int topRight(int x, int y, int[][] grid) {

//        System.out.println("top right "+ grid[x +1][y -1]);
        return grid[x + 1][y - 1];
    }

    public int bottomRight(int x, int y, int[][] grid) {
//        System.out.println("bottom right "+grid[x +1][y +1]);
        return grid[x + 1][y + 1];
    }

    public int bottom(int x, int y, int[][] grid) {
//        System.out.println("bottom "+grid[x][y +1]);
        return grid[x][y + 1];
    }

    public int bottomLeft(int x, int y, int[][] grid) {
//        System.out.println("bottom left "+ grid[x -1][y +1]);

        return grid[x - 1][y + 1];
    }

    public int[][] getNextGen(int[][] grid) {

        int[][] nextGrid = new int[grid.length][];


        for (int i = 0; i < grid.length; i++) {
            nextGrid[i] = new int[grid.length];

            for (int j = 0; j < grid.length; j++) {
                int value = grid[i][j];// current value

                System.out.println("current value " + value);
                int neighbours = 0; // FIXME: 2020/10/20 how to calculate neighbours?

                if (value == 70 && neighbours == 3) {

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


    int[][] assignState = {{4, 3}, {4, 4}, {4, 2}, {5, 4}};


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

    public static int checkNeighbours(int R, int L, int T, int B, int TR, int TL, int BR, int BL) {
        int neighbours = 0;

        if (R == 1) neighbours++;
        if (L == 1) neighbours++;
        if (T == 1) neighbours++;
        if (B == 1) neighbours++;
        if (TR == 1) neighbours++;
        if (TL == 1) neighbours++;
        if (BR == 1) neighbours++;
        if (BL == 1) neighbours++;

        return neighbours;
    }

    public static void main(String[] args) {

        Grid board = new Grid();

        board.printBoard();

        int aliveCells = 0;
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

                    if (y == getY & x == getX) {
                        grid[x][y] = 1;
                        aliveCells++;
                    }
                }
            }
        }

        System.out.println("------------------------------------------\n\n\n");
        board.printBoard();

        // TODO: 2020/10/21  count the neighbours for each cell
        //
        //todo -------------------------------------------------------
        //     -  get the cell
        //     -  check the surroundings of a cell
        //     -  assign that value to neighbours to know how many are there
        //     -  execute the rules (conways rules)

        int temp = 0;
        int[][] nextGrid = new int[grid.length][];

        for (int i = 0; i < grid.length; i++) {
            nextGrid[i] = grid[i].clone();
        }

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {

                int currentCell = grid[y][x];


                if (grid[y][x] == 1) {// - for testing
//                    temp++;
//                    if (temp < 2) {


                    System.out.println("cell " + grid[y][x]
                            + " -> top " + board.top(y, x, grid) + ":"
                            + " -> left " + board.left(y, x, grid) + ":"
                            + " -> bottom " + board.bottom(y, x, grid) + ":"
                            + " ->  bL " + board.bottomLeft(y, x, grid) + ":"
                            + " -> BR " + board.bottomRight(y, x, grid) + ":"
                            + " -> right " + board.right(y, x, grid) + ":"
                            + " -> TL" + board.topLeft(y, x, grid) + ":"
                            + " -> TR" + board.topRight(y, x, grid) + ":"
                    );
//
                    int neighbours = checkNeighbours(
                            // TODO: 2020/10/22
                            //  - need to implement "wrapping" in oder to move this method on top

                            board.right(y, x, grid),
                            board.left(y, x, grid),
                            board.top(y, x, grid),
                            board.bottom(y, x, grid),
                            board.topRight(y, x, grid),
                            board.topLeft(y, x, grid),
                            board.bottomRight(y, x, grid),
                            board.bottomLeft(y, x, grid)

                    );


                    if (currentCell == 0 & neighbours == 3) {

                        nextGrid[y][x] = 1;
                    } else if ((neighbours < 2 || neighbours > 3) & currentCell == 1) {
                        nextGrid[y][x] = 0;
                    } else {
                        nextGrid[y][x] = currentCell;
                    }

                }
//Todo do not delete                System.out.println(board.getNextGen(grid));

            }
        }

        // copying to the updated grid to the main board
        for (int i = 0; i < nextGrid.length; i++) {

            grid[i] = nextGrid[i].clone();
        }

        System.out.println("no. of alive cells " + aliveCells);

        System.out.println("------------------------------------------\n\n\n");
        board.printBoard();

    }
}




