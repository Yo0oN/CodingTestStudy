import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer line;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < T; i++) {
            line = new StringTokenizer(bufferedReader.readLine());

            int N = Integer.parseInt(line.nextToken());
            int M = Integer.parseInt(line.nextToken());

            result.append(combi(M, N)).append("\n");
        }

        bufferedWriter.write(result.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static int combi(int N, int M) {
        if (dp[N][M] > 0) {
            return dp[N][M];
        }

        if (N == M || M == 0) {
            return dp[N][M] = 1;
        }

        return dp[N][M] = combi(N - 1, M - 1) + combi(N - 1, M);
    }
}
