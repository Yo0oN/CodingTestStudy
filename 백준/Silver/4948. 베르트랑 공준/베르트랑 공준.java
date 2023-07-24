import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Boolean> primes = new ArrayList<>(123456 * 2 + 1);
        primes.add(0, false);
        primes.add(1, false);
        for (int i = 2; i <= 123456 * 2; i++) {
            primes.add(i, true);
        }
        for (int i = 2; i * i <= 123456 * 2; i++) {
            if (primes.get(i)) {
                for (int j = i * i; j <= 123456 * 2; j += i) {
                    primes.set(j, false);
                }
            }
        }

        while(true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (n == 0) {
                break;
            }
            int result = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (primes.get(i)) {
                    result++;
                }
            }
            bufferedWriter.write(result + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
