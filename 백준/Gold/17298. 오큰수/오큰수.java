import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int[] numbers = new int[size];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        Stack<Integer> stack = new Stack<>();

        for (int x = 0; x < size; x++) {
            numbers[x] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int x = 0; x < size; x++) {
            while (!stack.isEmpty() && numbers[x] > numbers[stack.peek()]) {
                numbers[stack.pop()] = numbers[x];
            }
            stack.push(x);
        }
        
        while(!stack.isEmpty()) {
            numbers[stack.pop()] = -1;
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int x = 0; x < size; x++) {
            result.append(numbers[x]);
            result.append(" ");
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
