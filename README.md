Sure! Here's a README file for the updated code:

# Tic-Tac-Toe Game

This is a simple command-line implementation of the Tic-Tac-Toe game written in Java. It allows two players to take turns and play the game until there is a winner or a draw.

## How to Play

1. The game board consists of a 3x3 grid. Each cell is represented by its coordinates (row and column), which range from 1 to 3.

2. Players take turns entering the coordinates of the cell they want to mark. Player 1 is represented by 'X', and Player 2 is represented by 'O'.

3. The game validates the input and checks if the chosen cell is empty. If the input is invalid or the cell is already occupied, the player is prompted to enter new coordinates.

4. The game board is displayed after each move, showing the updated positions of the marks.

5. The game continues until there is a winner (a player has three marks in a row, column, or diagonal) or the game ends in a draw (all cells are filled and no winner is found).

6. The final game state is displayed, indicating the winner or a draw.

## Running the Game

To run the Tic-Tac-Toe game, follow these steps:

1. Ensure you have Java installed on your system.

2. Download or clone the repository containing the code.

3. Compile the `Main.java` file using the Java compiler:
   ```
   javac Tic_Tac_Toe.java
   ```

4. Run the compiled code:
   ```
   java Tic_Tac_Toe
   ```

5. The game will start, and you can follow the prompts on the command line to play.

## Example Gameplay

Here's an example of how a Tic-Tac-Toe game session might look:

```
---------
|       |
|       |
|       |
---------
Enter the coordinates: 2 2
---------
|       |
|   X   |
|       |
---------
Enter the coordinates: 1 1
---------
| O     |
|   X   |
|       |
---------
Enter the coordinates: 3 1
---------
| O     |
|   X   |
| X     |
---------
Enter the coordinates: 2 3
---------
| O     |
|   X O |
| X     |
---------
Enter the coordinates: 1 3
---------
| O   X |
|   X O |
| X     |
---------
Enter the coordinates: 1 2
---------
| O   X |
| O X O |
| X     |
---------
Enter the coordinates: 3 3
---------
| O   X |
| O X O |
| X   X |
---------
X wins
```

## Contributions

Contributions to this Tic-Tac-Toe game are welcome. If you find any issues or have suggestions for improvements, feel free to create a pull request or submit an issue in the repository.

## License

This project is licensed under the [MIT License](LICENSE). Feel free to modify and distribute the code as per the terms of the license.

## Author

This Tic-Tac-Toe game was developed by [Your Name].
