import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(line.nextToken());
        int K = Integer.parseInt(line.nextToken());

        int last = (int) Math.sqrt(N); // 여기까지만 확인하면 이 값을 기준으로 이후 약수들은 이전 약수들에 의해 알게된다.

        HashMap<Integer, Integer> yaksu = new HashMap<>();
        yaksu.put(1, 1);
        int index = 2;
        for (int i = 2; i <= last; i++) {
            if (N % i == 0) {
                yaksu.put(index, i);
                index++;
            }
        }

        for (int i = Math.pow(yaksu.get(yaksu.size()), 2) == N ? yaksu.size() - 1 : yaksu.size(); i > 0; i--) {
            yaksu.put(index, N / yaksu.get(i));
            index++;
        }

        int result = 0;
        if (K <= yaksu.size()) {
            result = yaksu.get(K);
        }
        System.out.println(result);
    }
}
