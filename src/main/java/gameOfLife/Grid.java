package gameOfLife;



class Grid {

    public  static final String TEXT_RESET = "\u001B[0m";
    public  static final String TEXT_RED = "\u001B[31m";
    public static void main(String[] args) {


        System.out.println(TEXT_RED+"this text is Red? "+ TEXT_RESET);




        Board printBoard = new Board();
        Board board = new Board();
        AssignGridState assign = new AssignGridState();

//        System.out.println("presets "+ Arrays.deepToString(Presets.lShape.preset));


        System.out.println("------------------------------------------\n\n\n");
//        board.printBoard();
        System.out.println(printBoard);

        System.out.println("------------------------------------------\n\n\n");
        assign.assignGridState();
//        board.printBoard();
        System.out.println(printBoard);

        int runXTimes = 3;
        board.updateBoard(runXTimes);


    }
}




