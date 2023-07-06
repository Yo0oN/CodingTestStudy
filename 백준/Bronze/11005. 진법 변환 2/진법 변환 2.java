import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(line.nextToken());
        int B = Integer.parseInt(line.nextToken());

        StringBuilder result = new StringBuilder();
        while(N > 0) {
            int t = N % B;
            if (t >= 10) {
                result.insert(0, (char) (t + 55));
            } else {
                result.insert(0, t);
            }
            N = (N / B);
        }

        bufferedWriter.write(result.toString());
        bufferedWriter.close();
    }
}