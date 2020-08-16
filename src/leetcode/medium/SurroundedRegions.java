package leetcode.medium;

/**
 * 被围绕的区域
 */
public class SurroundedRegions {
    static int m, n;
    public static void solve(char[][] board) {
        m = board.length;
        if(m ==  0) {
            return;
        }
        n = board[0].length;
        for (int i = 0; i < n; i++) {
            process(0, i, board);
            process(m - 1, i, board);
        }
        for (int i = 1; i < m - 1; i++) {
            process(i, 0, board);
            process(i, n - 1, board);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }

    }
    public static void process(int i, int j, char[][] board) {
        if(i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'A';
        process(i, j - 1, board);
        process(i, j + 1, board);
        process(i - 1, j, board);
        process(i + 1, j, board);
    }

    public static void main(String[] args) {}

}
