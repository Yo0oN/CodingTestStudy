import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer line;

        line = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(line.nextToken());
        int K = Integer.parseInt(line.nextToken());

        int[] temps = new int[N];
        line = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            temps[i] = Integer.parseInt(line.nextToken());
        }

        int start = 0;
        int end = 0;
        int tempsSum = 0;
        int result = Integer.MIN_VALUE;
        while (end < N) {
            if (end - start < K) {
                tempsSum += temps[end];
                end++;
            } else {
                if (result < tempsSum) {
                    result = tempsSum;
                }
                tempsSum -= temps[start];
                start++;
            }
        }
        if (result < tempsSum) {
            result = tempsSum;
        }
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
