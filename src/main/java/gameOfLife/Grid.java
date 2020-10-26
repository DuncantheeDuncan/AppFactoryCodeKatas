package gameOfLife;

class Grid {

    public  static final String TEXT_RESET = "\u001B[0m";
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a number...");
//        int j = scanner.nextInt();
        System.out.println("co\n"+ TEXT_RESET);

        Board printBoard = new Board();

//        System.out.println(s);
        Board board = new Board();
        AssignGridState assign = new AssignGridState();
//        Board.setGrid(new int[4][4]); // updating the grid
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




