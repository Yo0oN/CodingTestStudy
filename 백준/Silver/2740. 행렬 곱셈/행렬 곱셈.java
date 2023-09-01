import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(line.nextToken());
        int M = Integer.parseInt(line.nextToken());
        int[][] NM = new int [N][M];

        for (int i = 0; i < N; i++) {
            line = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                NM[i][j] = Integer.parseInt(line.nextToken());
            }
        }

        line = new StringTokenizer(bufferedReader.readLine());
        M = Integer.parseInt(line.nextToken());
        int K = Integer.parseInt(line.nextToken());
        int[][] MK = new int [M][K];

        for (int i = 0; i < M; i++) {
            line = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < K; j++) {
                MK[i][j] = Integer.parseInt(line.nextToken());
            }
        }

        int[][] result = new int[N][K];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                int sum = 0;
                for (int k = 0; k < M; k++) {
                    sum += NM[i][k] * MK[k][j];
                }
                bufferedWriter.write(String.valueOf(sum));
                bufferedWriter.write(" ");
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
