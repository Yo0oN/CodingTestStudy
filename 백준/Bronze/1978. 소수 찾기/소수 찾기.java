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

        primes.add(2);
        primes.add(3);

        for (int i = 4; i <= 1000; i++) {
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

        int count = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer n = new StringTokenizer(bufferedReader.readLine());

        int result = 0;
        while (n.hasMoreTokens()) {
            int i = Integer.parseInt(n.nextToken());
            if (primes.contains(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
}
