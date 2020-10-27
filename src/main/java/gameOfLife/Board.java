package gameOfLife;



public class Board {

    public static int[][] grid = new int[18][18];
    private final int[][] nextGrid = new int[grid.length][];



    //    public static void setGrid(int[][] grid) {
//        Board.grid = grid;
//    }
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";

    @Override
    public String toString() {// prev print-Board
        StringBuilder line = new StringBuilder();
        for (int r = 0; r < grid.length; r++) {
            line.append("\n");
            for (int i = 0, gridLength = grid.length; i < gridLength; i++) {
                int[] ints = grid[i];
//                line.append("[").append(ints[r]).append("]");
//                line.append("").append(ints[r]).append("");
                if (ints[r] == 1) {
                    line.append(TEXT_RED).append("[").append(ints[r]).append("]").append(TEXT_RESET);

                } else {
                    line/*.append(TEXT_RED)*/.append("[").append(ints[r]).append("]")/*.append(TEXT_RESET)*/;
                }
            }
        }

//        String setBackFrontColor = "\033[107m\033[30m";
        return /*setBackFrontColor +*/ String.valueOf(line);
    }




    public void updateBoard(int printXTimes) {
    
    
        for (int i = 0; i < grid.length; i++)
            nextGrid[i] = grid[i].clone();


        for (int print = 0; print < printXTimes; print++) {
            

            for (int y = 0; y < grid.length; y++) {
                for (int x = 0; x < grid[y].length; x++) {

                    int currentCell = grid[y][x];
                    int xSize = grid.length;
                    int ySize = grid[y].length;

                    CountNeighbour cn = new CountNeighbour();

                    int neighbours = CountNeighbour.checkNeighbours
                            (
                                    cn.right(y, x, xSize, ySize, grid), cn.left(y, x, xSize, ySize, grid),
                                    cn.top(y, x, xSize, ySize, grid), cn.bottom(y, x, xSize, ySize, grid),
                                    cn.topRight(y, x, xSize, ySize, grid), cn.topLeft(y, x, xSize, ySize, grid),
                                    cn.bottomRight(y, x, xSize, ySize, grid), cn.bottomLeft(y, x, xSize, ySize, grid)
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


            for (int i = 0; i < nextGrid.length; i++)
                grid[i] = nextGrid[i].clone();


            System.out.println("------------------------------------------\n\n\n");
//            printBoard();
            System.out.println("Iteration number ("+(print+1)+")");
            System.out.println(toString());


        }
    }





}
