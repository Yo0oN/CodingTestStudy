import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] N = reader.readLine().toCharArray(); // 입력된 문자열
        int M = Integer.parseInt(reader.readLine()); // 앞으로 입력될 명령 개수

        Stack<Character> sentence1 = new Stack<>(); // 커서의 왼쪽
        for (char n : N) {
            sentence1.add(n);
        }
        Stack<Character> sentence2 = new Stack<>(); // 커서의 오른쪽

        for (int x = 0; x < M; x++) {
            String order = reader.readLine();
            switch (order) {
                case "L" : // 왼쪽으로
                    if (!sentence1.isEmpty()){
                        sentence2.add(sentence1.pop());
                    }
                    break;
                case "D" : // 오른쪽으로
                    if (!sentence2.isEmpty()) {
                        sentence1.add(sentence2.pop());
                    }
                    break;
                case "B" : // 하나 삭제
                    if (!sentence1.isEmpty()) {
                        sentence1.pop();
                    }
                        break;
                default : // 왼쪽에 문자열 추가
                    char[] addChar = order.toCharArray();
                    sentence1.add(addChar[2]);
                    break;
            }
        }

        StringBuffer result = new StringBuffer();
        sentence1.forEach(result::append);
        while(!sentence2.isEmpty()) {
            result.append(sentence2.pop());
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
