import java.util.Scanner;

public class Main {
    private static int player = 1;
    public static String createBoard(String cell) {
        String border = "---------\n";
        String ticTacBoard = border;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if(j == 0 || j == 8){
                    ticTacBoard = ticTacBoard + "|";
                }
                else if(j == 1 || j == 3 || j == 5 || j == 7){
                    ticTacBoard = ticTacBoard + " ";
                } else {
                    ticTacBoard = ticTacBoard + cell.charAt(index);
                    index++;
                }
                if (j == 8) {
                    ticTacBoard = ticTacBoard + "\n";
                }
            }
        }
        ticTacBoard = ticTacBoard + border;
        return ticTacBoard;
    }
    public static String gameState(String cell) {
        int xCount = 0;
        int yCount = 0;
        int impossibleTracker = 0;
        String stateStatus = "";
        for (int i = 0; i < cell.length(); i++) {
            if (cell.charAt(i) == 'X') {
                xCount++;
            }
            if (cell.charAt(i) == 'O') {
                yCount++;
            }
        }
        if (Math.abs(xCount - yCount) > 1) {
            stateStatus = "Impossible";
            return stateStatus;
        }
        for (int i = 2; i < cell.length(); i++){
            if (cell.charAt(i - 2) == 'X' && cell.charAt(i - 1) == 'X' && cell.charAt(i) == 'X'){
                stateStatus = "X wins";
                impossibleTracker++;
            } else if (cell.charAt(i - 2) == 'O' && cell.charAt(i - 1) == 'O' && cell.charAt(i) == 'O'){
                stateStatus = "O wins";
                impossibleTracker++;
            }
            i++;
            i++;
        }
        for (int i = 6; i < cell.length(); i++) {
            if (cell.charAt(i - 6) == 'X' && cell.charAt(i - 3) == 'X' && cell.charAt(i) == 'X'){
                stateStatus = "X wins";
                impossibleTracker++;
            } else if (cell.charAt(i - 6) == 'O' && cell.charAt(i - 3) == 'O' && cell.charAt(i) == 'O') {
                stateStatus = "O wins";
                impossibleTracker++;
            }
        }
        if ((cell.charAt(8) == 'X' && cell.charAt(4) == 'X' && cell.charAt(0) == 'X') || (cell.charAt(6) == 'X' && cell.charAt(4) == 'X' && cell.charAt(2) == 'X')){
            stateStatus = "X wins";
            impossibleTracker++;
        } else if ((cell.charAt(8) == 'O' && cell.charAt(4) == 'O' && cell.charAt(0) == 'O') || (cell.charAt(6) == 'O' && cell.charAt(4) == 'O' && cell.charAt(2) == 'O')) {
            stateStatus = "O wins";
            impossibleTracker++;
        }
        if (stateStatus.isEmpty() && cell.contains(" ")) {
            stateStatus = "Game not finished";
        } else if (stateStatus.isEmpty() && !cell.contains(" ")) {
            stateStatus = "Draw";
        } else if(impossibleTracker > 1) {
            stateStatus = "Impossible";
        }
        return stateStatus;
    }
    public static String move(String cells){
        Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            while (row > 3 || row < 1 || col > 3 || col < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
                row = scanner.nextInt();
                col = scanner.nextInt();
            }
            int index = 0;
            if (row == 1) {
                index = col - 1;
            } else if (row == 2) {
                index = col + 2;
            } else if( row == 3) {
                index = col + 5;
            }

            while (cells.charAt(index) != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.print("Enter the coordinates: ");
                row = scanner.nextInt();
                col = scanner.nextInt();
                if (row == 1) {
                    index = col - 1;
                } else if (row == 2) {
                    index = col + 2;
                } else if( row == 3) {
                    index = col + 5;
                }
            }
            StringBuilder cell2 = new StringBuilder(cells);
            if (player % 2 != 0) {
                cell2.setCharAt(index, 'X');
            } else {
                cell2.setCharAt(index, 'O');
            }
            player++;
            cells = cell2.toString();
        return cells;
    }
    public static void main(String[] args) {
        String cells = "         ";
        String fullBoard = createBoard(cells);
        System.out.println(fullBoard);
        while(gameState(cells).contentEquals("Game not finished")) {
            System.out.print("Enter the coordinates: ");
            cells = move(cells);
            System.out.println(createBoard(cells));
        }
        System.out.println(gameState(cells));
    }

    }
