import java.util.*;

public class BoardGame {
    public static boolean isValid(int x, int y, int[][] grid, boolean[][] visited, int M, int N) {
        return x >= 0 && y >= 0 && x < M && y < N && grid[x][y] == 0 && !visited[x][y];
    }
    public static int bfs(int[][] grid, int[] source, int[] destination, int[] moveRule, int M, int N) {
        int[][] directions = {
            {moveRule[0], moveRule[1]},  
            {moveRule[1], -moveRule[0]},
            {-moveRule[0], -moveRule[1]}, 
            {-moveRule[1], moveRule[0]}   
        };
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[M][N];
        queue.add(new int[]{source[0], source[1], 0});
        visited[source[0]][source[1]] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int moves = current[2];
            if (x == destination[0] && y == destination[1]) {
                return moves;
            }
            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];
                if (isValid(newX, newY, grid, visited, M, N)) {
                    queue.add(new int[]{newX, newY, moves + 1});
                    visited[newX][newY] = true;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int[] source = new int[2];
        source[0] = sc.nextInt();
        source[1] = sc.nextInt();
        int[] destination = new int[2];
        destination[0] = sc.nextInt();
        destination[1] = sc.nextInt();
        int[] moveRule = new int[2];
        moveRule[0] = sc.nextInt();
        moveRule[1] = sc.nextInt();
        int result = bfs(grid, source, destination, moveRule, M, N);
        System.out.println(result);
        sc.close();
    }
}