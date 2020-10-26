package gameOfLife;

public enum Presets {
    lShape(new int[][]{{4, 3}, {4, 4}, {4, 2}, {5, 4}}),
    glide(new int[][]{{4, 3}, {5, 4}, {5, 5}, {4, 5}, {3, 5}});


    int[][] preset;

    Presets(int[][] preset) {
        this.preset = preset;
    }

//    public String getPresets(){
//
//        for(Presets pr :Presets.values()){
//            System.out.println(pr);
//        }
//        return "";
//    }

}
