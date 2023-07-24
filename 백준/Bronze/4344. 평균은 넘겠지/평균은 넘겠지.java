import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int C = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < C; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

            int n = Integer.parseInt(line.nextToken());
            double avr = 0.0;
            int[] scores = new int[n];
            for (int j = 0; j < n; j++) {
                scores[j] = Integer.parseInt(line.nextToken());
                avr += scores[j];
            }
            avr /= n;
            double count = 0;
            for (int score : scores) {
                if (score > avr) {
                    count++;
                }
            }
            String result = String.format("%.3f%%\n", ((count / n) * 100));
            bufferedWriter.write(result);
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
