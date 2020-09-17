package leetcode.easy.normal;

/**
 * 岛屿的周长
 */
public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    return dfs(grid, i, j, grid.length, grid[0].length);
                }
            }
        }
        return 0;
    }
    public static int dfs(int[][] grid, int i, int j, int m, int n) {
        if(!(i >= 0 && i < m && j >= 0 && j < n)) {
            return 1;
        }
        if(grid[i][j] == 0) {
            return 1;
        }
        if(grid[i][j] == 2) {
            return 0;
        }
        grid[i][j] = 2;
        return dfs(grid, i - 1, j, m, n)
                +  dfs(grid, i + 1, j, m, n)
                +  dfs(grid, i, j - 1, m, n)
                +  dfs(grid, i, j + 1, m, n);
    }

    public static void main(String[] args) {
        int[][] island = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(island));
    }
}
