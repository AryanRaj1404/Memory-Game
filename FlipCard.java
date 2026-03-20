import java.util.*;

class FlipCard{
    public static int getCardIndex(Scanner scanner, String[] board, boolean[] flipped, String prompt){
        int index;
        while(true){
            System.out.println(prompt);
            index = scanner.nextInt();
            if(index < 0 || index >= board.length){
                System.out.println("Invalid index, try again!!");
            } else if(flipped[index]){
                System.out.println("Card already flipped, try again!!");
            } else break;
        }
        return index;
    }
}