package game_of_life;

public class Board {

    public static int[][] grid = new int[8][8];
    int[][] nextGrid = new int[grid.length][];


    public void printBoard() {
        StringBuilder line = null;
        for (int r = 0; r < grid.length; r++) {
            line = new StringBuilder();
            for (int[] ints : grid)
                line.append("[").append(ints[r]).append("]");

            System.out.println(line);

        }


    }

    public void updateBoard(){


        for (int i = 0; i < grid.length; i++) {
            nextGrid[i] = grid[i].clone();
        }

        // run n times
        for (int run = 0; run < 3; run++) {// running n

            for (int y = 0; y < grid.length; y++) {
                for (int x = 0; x < grid[y].length; x++) {

                    int currentCell = grid[y][x];


                    int xSize = grid.length;
                    int ySize = grid[y].length;




                    CountNeighbour checkNeighbour = new CountNeighbour();

                    int neighbours = CountNeighbour.checkNeighbours
                            (
                                    checkNeighbour.right(y, x, xSize, ySize, grid), checkNeighbour.left(y, x, xSize, ySize, grid),
                                    checkNeighbour.top(y, x, xSize, ySize, grid), checkNeighbour.bottom(y, x, xSize, ySize, grid),
                                    checkNeighbour.topRight(y, x, xSize, ySize, grid), checkNeighbour.topLeft(y, x, xSize, ySize, grid),
                                    checkNeighbour.bottomRight(y, x, xSize, ySize, grid), checkNeighbour.bottomLeft(y, x, xSize, ySize, grid)
                            );


                    if (currentCell == 0 & neighbours == 3) {

                        nextGrid[y][x] = 1;
                    } else if ((neighbours < 2 || neighbours > 3) & currentCell == 1) {
                        nextGrid[y][x] = 0;
                    } else {
                        nextGrid[y][x] = currentCell;
                    }
                }
            }

            // copying to the updated grid to the main board
            for (int i = 0; i < nextGrid.length; i++) {

                grid[i] = nextGrid[i].clone();
            }

//            System.out.println("no. of alive cells " + aliveCells);

            System.out.println("------------------------------------------\n\n\n");
            printBoard();

        }
    }


}
