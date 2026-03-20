class Board{
    public static void printBoard(String[] board){
        for(String value : board) {
            System.out.print("| " + value +" ");
        }
        System.out.println("|");
    }
}