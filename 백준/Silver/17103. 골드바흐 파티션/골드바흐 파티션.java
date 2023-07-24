import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        List<Boolean> primes = new ArrayList<>(1000000 + 1);
        primes.add(0, false);
        primes.add(1, false);
        for (int i = 2; i <= 1000000; i++) {
            primes.add(i, true);
        }
        for (int i = 2; i * i <= 1000000; i++) {
            if (primes.get(i)) {
                for (int j = i * i; j <= 1000000; j += i) {
                    primes.set(j, false);
                }
            }
        }

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int result = 0;
            for (int j = n - 1; j >= (n / 2); j--) {
                if (primes.get(j) && primes.get(n - j)) {
                    result++;
                }
            }
            bufferedWriter.write(result + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
