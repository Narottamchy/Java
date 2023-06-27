import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;
    private boolean gameEnded;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameEnded = false;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!");

        while (!gameEnded) {
            System.out.println("\nCurrent board:");
            displayBoard();

            System.out.print("Player " + currentPlayer + ", enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Player " + currentPlayer + ", enter column (0-2): ");
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);

                if (checkWin()) {
                    System.out.println("\nPlayer " + currentPlayer + " wins!");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    System.out.println("\nThe game ends in a draw!");
                    gameEnded = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("\nInvalid move. Please try again.");
            }
        }

        System.out.println("\nFinal board:");
        displayBoard();
        scanner.close();
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') {
            return false;
        }
        return true;
    }

    private void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
