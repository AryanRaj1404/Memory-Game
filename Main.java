import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<String> cards = new ArrayList<>();

        cards.add("A");
        cards.add("A");
        cards.add("B");
        cards.add("B");
        cards.add("C");
        cards.add("C");
        cards.add("D");
        cards.add("D");

        Collections.shuffle(cards);

        // System.out.println(cards); // try code

        String[] board = new String[cards.size()];
        Arrays.fill(board, " ");

        //try code
        // for(String s: board){
        //     System.out.println(s);
        // }

        boolean[] flipped = new boolean[cards.size()];

        int pairOfCards = 0;

        System.out.println("WELCOME TO MEMORY GAME");

        while(pairOfCards<4){
            Board.printBoard(board);

            
        }
    }
}