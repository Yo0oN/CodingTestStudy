import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> primes = new ArrayList<>();

        int M = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());

        primes.add(2);
        primes.add(3);

        for (int i = 4; i <= N; i++) {
            boolean isPrime = true;
            for(int j = 0; j < primes.size(); j++) {
                if (i % primes.get(j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }

        int sum = 0;
        int min = 0;
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i) < M) {
                continue;
            }
            if (primes.get(i) > N) {
                break;
            }
            if (min == 0) {
                min = primes.get(i);
            }
            sum += primes.get(i);
        }

        if (sum > 0) {
            System.out.println(sum);
            System.out.println(min);

        } else {
            System.out.println(-1);
        }
    }
}
