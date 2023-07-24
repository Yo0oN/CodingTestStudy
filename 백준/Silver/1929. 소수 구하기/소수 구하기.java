import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer MN = new StringTokenizer(bufferedReader.readLine());

        int M = Integer.parseInt(MN.nextToken());
        int N = Integer.parseInt(MN.nextToken());

        for (int i = M; i <= N; i++) {
            BigInteger now = new BigInteger(String.valueOf(i));
            if (now.isProbablePrime(10)) {
                bufferedWriter.write(now + "\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
