import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            int order = Integer.parseInt(line.nextToken());
            int result = 0;
            switch (order) {
                case 1 :
                    int number = Integer.parseInt(line.nextToken());
                    stack.add(number);
                    break;
                case 2 :
                    result = stack.isEmpty() ? -1 : stack.pop();
                    break;
                case 3 :
                    result = stack.size();
                    break;
                case 4 :
                    result = stack.isEmpty() ? 1 : 0;
                    break;
                case 5 :
                    result = stack.isEmpty() ? -1 : stack.peek();
                    break;
            }
            if (order != 1) {
                bufferedWriter.write(String.valueOf(result) + "\n");
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
