import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[][] first = new int[N][M];
        int[][] second = new int[N][M];
        for (int i = 0; i < N; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                first[i][j] = Integer.parseInt(line.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                second[i][j] = Integer.parseInt(line.nextToken());
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result.append(first[i][j] + second[i][j]);
                result.append(" ");
            }
            result.append("\n");
        }

        bufferedWriter.write(result.toString());
        bufferedWriter.close();
    }
}
