import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine()); // 입력 받을 수의 개수

        StringTokenizer numbers = new StringTokenizer(bufferedReader.readLine()); // 입력받은 수들
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(numbers.nextToken());
            int value = numberMap.getOrDefault(key, 0);
            numberMap.put(key, ++value);
        }
        int v = Integer.parseInt(bufferedReader.readLine()); // 찾으려는 수

        System.out.println(numberMap.getOrDefault(v, 0));
    }
}
