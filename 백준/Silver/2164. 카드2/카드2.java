import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine()); // 카드 수

        Queue<Integer> cardQueue = new LinkedList<>();
        for (int x = 0; x < N; x++) {
            cardQueue.add(x + 1);
        }

        while (cardQueue.size() > 1) {
            // 첫번째 카드 제거
            cardQueue.remove();
            // 두번째 카드 바닥으로 보내기
            cardQueue.add(cardQueue.poll());
        }
        System.out.println(cardQueue.peek());
    }
}
