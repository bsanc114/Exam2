public class MinimumFallingPath {
    public int minimumFallingPath(int[][] input) {
        int N = input.length;
        for (int r = N - 2; r >= 0; --r) {
            for (int c = 0; c < N; ++c) {
                int bestChoice = input[r + 1][c];
                if (c > 0)
                    bestChoice = Math.min(bestChoice, input[r + 1][c - 1]);
                if (c + 1 < N)
                    bestChoice = Math.min(bestChoice, input[r + 1][c + 1]);
                input[r][c] += bestChoice;
            }
        }

        int bestPathSum = Integer.MAX_VALUE;
        for (int x : input[0])
            bestPathSum = Math.min(bestPathSum, x);
        return bestPathSum;
    }
}
