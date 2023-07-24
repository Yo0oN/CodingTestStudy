import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

            int A = Integer.parseInt(line.nextToken());
            int B = Integer.parseInt(line.nextToken());

            int a = A;
            int b = B;
            while (a != b) {
                if (a < b) {
                    b -= a;
                } else {
                    a -= b;
                }
            }

            String result = String.format("%d\n", (A * B) / a);

            bufferedWriter.write(result);
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
