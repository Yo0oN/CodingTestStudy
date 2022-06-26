import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(reader.readLine()); // 앞으로 입력될 수

        Stack<Integer> moneyStack = new Stack<>();
        for (int x = 0; x < K; x++){
            int newNumber = Integer.parseInt(reader.readLine()); // 새로 들어온 수

            if (newNumber == 0) {
                moneyStack.pop();
            } else {
                moneyStack.add(newNumber);
            }
        }

        int result = 0;
        for (int money : moneyStack) {
            result += money;
        }

        System.out.println(result);
    }
}
