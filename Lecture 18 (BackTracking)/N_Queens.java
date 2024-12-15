public class N_Queens {  // Time complexity is O(n!)
    static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col){
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int i = row - 1, j = col - 1 ; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        
        // diag right up
        for (int i = row - 1, j = col + 1 ; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char[][] board, int row){
        // Base case
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);  // func call step
                board[row][j] = 'x';  // backtracking step
            }

        }
    }


    // for print only 1 solution
    // public static boolean nQueens(char[][] board, int row){
    //     // Base case
    //     if (row == board.length) {
    //         return true;
    //     }

    //     // colunm loop
    //     for (int j = 0; j < board.length; j++) {
    //         if(isSafe(board, row, j)){
    //             board[row][j] = 'Q';
    //             if(nQueens(board, row+1)){  // func call step
    //                 return true;
    //             }
    //             board[row][j] = 'x';  // backtracking step
    //         }
    //     }
    //     return false;
    // }

    public static void printBoard(char[][] board){
        System.out.println("-------------- <CHESS BOARD> --------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        
        nQueens(board, 0);

        System.out.println("-------- <Total ways to Solve N_Queens> ---------");
        System.out.print(count);

        // for print only 1 solution
        // if(nQueens(board, 0)){
        //     System.out.println("Solution is Possible");
        //     printBoard(board);
        // } else{
        //     System.out.println("Solution is not possible");
        // }
    }
}
