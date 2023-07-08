import java.io.*;
import java.util.HashMap;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (n == -1) {
                break;
            }

            int last = (int) Math.sqrt(n); // 여기까지만 확인하면 이 값을 기준으로 이후 약수들은 이전 약수들에 의해 알게된다.

            HashMap<Integer, Integer> yaksu = new HashMap<>();
            yaksu.put(1, 1);
            int index = 2;
            for (int i = 2; i <= last; i++) {
                if (n % i == 0) {
                    yaksu.put(index, i);
                    index++;
                }
            }

            for (int i = Math.pow(yaksu.get(yaksu.size()), 2) == n ? yaksu.size() - 1 : yaksu.size(); i > 1; i--) {
                yaksu.put(index, n / yaksu.get(i));
                index++;
            }

            int sum = 0;
            StringBuilder result = new StringBuilder();
            result.append(n);
            result.append(" = ");
            for (int i = 1; i <= yaksu.size(); i++) {
                sum += yaksu.get(i);
                result.append(yaksu.get(i));
                if (i != yaksu.size()) {
                    result.append(" + ");
                }
            }
            if (sum != n) {
                result.delete(0, result.length());
                result.append(n);
                result.append(" is NOT perfect.");
            }
            result.append("\n");
            bufferedWriter.write(result.toString());
        }
        bufferedWriter.close();
    }
}
