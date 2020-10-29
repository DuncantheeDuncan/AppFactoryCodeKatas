package gameOfLife;

public enum Presets {
    L_SHAPE(new int[][]{{4, 3}, {4, 4}, {4, 2}, {5, 4}}),
    STROKE(new int[][]{{0, 1}, {0, 2}, {0, 3}}),
    GLIDE(new int[][]{{4, 3}, {5, 4}, {5, 5}, {4, 5}, {3, 5}});


    int[][] preset;

     Presets(int[][] preset) {
        this.preset = preset;
    }


}
