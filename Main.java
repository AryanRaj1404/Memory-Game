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
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO MEMORY GAME");

        while(pairOfCards<4){
            Board.printBoard(board);

            int firstIndex = FlipCard.getCardIndex(scanner, board, flipped, "Enter the index of the first card");
            board[firstIndex] = cards.get(firstIndex);
            flipped[firstIndex] = true;
            Board.printBoard(board);

            int secondIndex = FlipCard.getCardIndex(scanner, board, flipped, "Enter the index of the second card");
            board[secondIndex] = cards.get(secondIndex);
            flipped[secondIndex] = true;
            Board.printBoard(board);

            if(cards.get(firstIndex).equals(cards.get(secondIndex))){
                pairOfCards++;
                System.out.println("You found "+ pairOfCards + " pair");
            } else {
                System.out.println("Those cards doesn't match, try again");
                board[firstIndex] = " ";
                board[secondIndex] = " ";
                flipped[firstIndex] = false;
                flipped[secondIndex] = false;
            }
        }
        System.out.println("You won");
        scanner.close();
    }
}