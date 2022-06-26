import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String sentence = reader.readLine(); // 입력된 문장
            if (".".equals(sentence)) {
                break;
            }

            char[] basketArray = sentence.toCharArray();
            Stack<Character> basketStack = new Stack<>();
            boolean result = true;
            for (char basket : basketArray) {
                if (basket == '(' || basket == '[') {
                    basketStack.add(basket);
                } else if (basket == ')' || basket == ']') {
                    if (basketStack.isEmpty()) {
                        result = false;
                        break;
                    }
                    char startBasket = basketStack.pop();
                    if ((startBasket == '(' && basket == ']') || (startBasket == '[' && basket == ')')) {
                        result = false;
                        break;
                    }
                }
            }
            if (result && basketStack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
