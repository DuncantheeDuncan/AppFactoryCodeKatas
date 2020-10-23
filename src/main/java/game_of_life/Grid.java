package game_of_life;

class Grid {

    public static void main(String[] args) {

        Board board = new Board();
        AssignGridState assign = new AssignGridState();



        System.out.println("------------------------------------------\n\n\n");
        board.printBoard();

        System.out.println("------------------------------------------\n\n\n");
        assign.assignGridState();
        board.printBoard();

        System.out.println("------------------------------------------\n\n\n");
        board.updateBoard();
    }
}




