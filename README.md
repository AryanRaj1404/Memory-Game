# Memory-Game
It is a card based memory game in java where you have to find the pairs of each card.


## Steps to build
1. Create an ArrayList and add 8 cards into it.
2. Create a String array and initialize with whitespace.
3. A boolean array to indicate if the cards are visible or hidden.
4. Initialized a variable pairOfCards to check how many pairs are found.
5. Let's Start the game now.
6. Print the board.
7. Start a while loop which runs until the found pairOfCards reaches 4.
8. Enter the index of the card you want to turn and then enter another index which makes their indices true and then check if the cards at both indices are same.
9. If the cards are same, value of pairOfCards increases by 1 and if not the value of flipped card indices become false again.
10. This process repeats until the pairOfCards reaches 4.
11. At the end you win the game and the game is over.
