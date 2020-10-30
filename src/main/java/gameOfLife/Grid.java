package gameOfLife;

class Grid {

    public static void main(String[] args) {

        Board printBoard = new Board();
        Board board = new Board();
        AssignGridState assign = new AssignGridState();


        System.out.println("Initializing empty grid\n"+board.gridBox()+"\nInitialized empty grid");

        System.out.println("------------------------------------------\n");
        System.out.println("\nInitializing start position");
        assign.assignGridState();

        System.out.println(board.gridBox());
        
        System.out.println("\nInitialized start position");

        int runXTimes = 3;
        board.updateBoard(runXTimes);



    }
}




