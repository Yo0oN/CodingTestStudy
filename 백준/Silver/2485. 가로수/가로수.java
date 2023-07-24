import java.io.*;
import java.math.BigInteger;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] before = new int[count];
        int[] dis = new int[count - 1];
        BigInteger gcd = null;
        for (int i = 0; i < count; i++) {
            before[i] = Integer.parseInt(bufferedReader.readLine());
            if (i > 0) {
                dis[i - 1] = before[i] - before[i - 1];
                if (i == 1) {
                    gcd = BigInteger.valueOf(before[i] - before[i - 1]);
                } else {
                    gcd = gcd.gcd(BigInteger.valueOf(before[i] - before[i - 1]));
                }
            }
        }
        int result = 0;
        for (int i : dis) {
            result += (i / gcd.intValue()) - 1;
        }

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
