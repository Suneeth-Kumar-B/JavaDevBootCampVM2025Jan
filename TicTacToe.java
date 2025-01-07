import java.util.Scanner;

class TicTacToe {
    static Scanner in = new Scanner(System.in);
    static final char PLAYER_X = 'X';
    static final char PLAYER_O = 'O';
    static final char EMPTY = '_';
    char[][] board;

    // Constructor initializes the board
    TicTacToe() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    // Checks for a winner
    String checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != EMPTY && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0] + " Wins";
            }
            if (board[0][i] != EMPTY && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i] + " Wins";
            }
        }
        // Check diagonals
        if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0] + " Wins";
        }
        if (board[0][2] != EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2] + " Wins";
        }
        return "";
    }

    // Displays the board
    void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Handles a single player's turn
    void playerTurn(char player) {
        int x, y;
        System.out.println("Turn: " + player);
        while (true) {
            System.out.print("\tPick a row and a column (0-2): ");
            x = in.nextInt();
            y = in.nextInt();
            if (x >= 0 && x < 3 && y >= 0 && y < 3 && board[x][y] == EMPTY) {
                board[x][y] = player;
                break;
            } else {
                System.out.println("\tInvalid move, try again.");
            }
        }
    }

    // Main game logic
    void play() {
        System.out.println("Welcome to Tic Tac Toe!\n");
        displayBoard();

        for (int i = 0; i < 9; i++) {
            char currentPlayer = (i % 2 == 0) ? PLAYER_X : PLAYER_O;
            playerTurn(currentPlayer);
            displayBoard();

            String result = checkWinner();
            if (!result.isEmpty()) {
                System.out.println(result);
                return;
            }
        }
        System.out.println("It's a tie!");
    }

    // Main method
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}