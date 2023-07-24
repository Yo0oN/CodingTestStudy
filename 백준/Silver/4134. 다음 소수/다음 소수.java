import java.io.*;
import java.math.BigInteger;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < count; i++) {
            BigInteger n = new BigInteger(bufferedReader.readLine());

            if (n.isProbablePrime(10)) {
                bufferedWriter.write(n + "\n");
            } else {
                bufferedWriter.write(n.nextProbablePrime() + "\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
