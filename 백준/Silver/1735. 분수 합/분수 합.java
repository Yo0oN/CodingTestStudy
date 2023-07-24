import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        int A1 = Integer.parseInt(line.nextToken());
        int B1 = Integer.parseInt(line.nextToken());
        line = new StringTokenizer(bufferedReader.readLine());
        int A2 = Integer.parseInt(line.nextToken());
        int B2 = Integer.parseInt(line.nextToken());

        int A = (A1 * B2) + (A2 * B1);
        int B = B1 * B2;

        int a = A;
        int b = B;
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }

        String result = String.format("%d %d", (A / a), (B / a));
        bufferedWriter.write(result);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
