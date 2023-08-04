import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        int now = 1;
        String result = "Nice";
        Stack<Integer> stack = new Stack<>();
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

        while(now <= count) { // !stack.isEmpty() || line.hasMooreTokens()
            if (stack.isEmpty() && line.hasMoreTokens()) { // line만 있는 경우
                // line의 사람이 현재 사람이면 진행, 아니면 stack에 넣기
                int person = Integer.parseInt(line.nextToken());
                if (person == now) {
                    now++;
                } else {
                    stack.add(person);
                }
            } else if (!stack.isEmpty() && !line.hasMoreTokens()) { // stack만 있는 경우
                int person = stack.pop();
                if (person == now) {
                    now++;
                } else {
                    result = "Sad";
                    break;
                }
            } else if (!stack.isEmpty() && line.hasMoreTokens()) { // 둘 다 있는 경우
                if (stack.peek() == now) { // stack에 있는 수가 차례면 내보내기
                    stack.pop();
                    now++;
                } else { // 아니면 줄에 서있는 사람을 stack에 넣기
                    stack.add(Integer.parseInt(line.nextToken()));
                }
            }
        }

        bufferedWriter.write(result);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
