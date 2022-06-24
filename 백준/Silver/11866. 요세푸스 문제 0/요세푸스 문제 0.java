import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" "); // 입력받기
        int N = Integer.parseInt(input[0]); // 사람 수
        int K = Integer.parseInt(input[1]); // 제거될 위치

        Queue<Integer> peopleQueue = new LinkedList<>();

        for (int x = 0; x < N; x++) {
            peopleQueue.add(x + 1);
        }

        String result = "<";
        int order = 1;

        while (peopleQueue.size() > 1) {
            if (order == K) {
                result += (peopleQueue.poll() + ", ");
                order = 1;
            } else {
                peopleQueue.add(peopleQueue.poll());
                order++;
            }
        }
        result += peopleQueue.poll() + ">";

        System.out.println(result);
    }
}
