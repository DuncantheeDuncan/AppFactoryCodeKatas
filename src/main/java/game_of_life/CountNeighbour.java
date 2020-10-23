package game_of_life;

public class CountNeighbour implements Directions {

    @Override
    public int left(int x, int y, int xSize, int ySize, int[][] grid) {
        return grid[Directions.mod(x - 1, xSize)][Directions.mod(y, ySize)];
    }

    @Override
    public int top(int x, int y, int xSize, int ySize, int[][] grid) {
        return grid[Directions.mod(x, xSize)][Directions.mod(y - 1, ySize)];
    }

    @Override
    public int topLeft(int x, int y, int xSize, int ySize, int[][] grid) {
        return grid[Directions.mod(x - 1, xSize)][Directions.mod(y - 1, ySize)];
    }

    @Override
    public int right(int x, int y, int xSize, int ySize, int[][] grid) {
        return grid[Directions.mod(x + 1, xSize)][Directions.mod(y, ySize)];
    }

    @Override
    public int topRight(int x, int y, int xSize, int ySize, int[][] grid) {
        return grid[Directions.mod(x + 1, xSize)][Directions.mod(y - 1, ySize)];
    }

    @Override
    public int bottomRight(int x, int y, int xSize, int ySize, int[][] grid) {
        return grid[Directions.mod(x + 1, xSize)][Directions.mod(y + 1, ySize)];
    }

    @Override
    public int bottom(int x, int y, int xSize, int ySize, int[][] grid) {
        return grid[Directions.mod(x, xSize)][Directions.mod(y + 1, ySize)];
    }

    @Override
    public int bottomLeft(int x, int y, int xSize, int ySize, int[][] grid) {

        return grid[Directions.mod(x - 1, xSize)][Directions.mod(y + 1, ySize)];
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

}
