package game_of_life;

public interface Directions {

    static int mod(int x, int m) {
        m = Math.abs(m);
        return (x % m + m) % m;
    }

    int left(int x, int y, int xSize, int ySize, int[][] grid);

    int top(int x, int y, int xSize, int ySize, int[][] grid);

    int topLeft(int x, int y, int xSize, int ySize, int[][] grid);

    int right(int x, int y, int xSize, int ySize, int[][] grid);

    int topRight(int x, int y, int xSize, int ySize, int[][] grid);

    int bottomRight(int x, int y, int xSize, int ySize, int[][] grid);

    int bottom(int x, int y, int xSize, int ySize, int[][] grid);

    int bottomLeft(int x, int y, int xSize, int ySize, int[][] grid);

}
