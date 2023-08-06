import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            int order = Integer.parseInt(line.nextToken());
            int number;
            int result;
            switch(order) {
                case 1:
                    number = Integer.parseInt(line.nextToken());
                    queue.add(0, number);
                    break;
                case 2:
                    number = Integer.parseInt(line.nextToken());
                    queue.add(number);
                    break;
                case 3:
                    result = queue.isEmpty() ? -1 : queue.poll();
                    bufferedWriter.write(result + "\n");
                    break;
                case 4:
                    result = queue.isEmpty() ? -1 : queue.pollLast();
                    bufferedWriter.write(result + "\n");
                    break;
                case 5:
                    result = queue.size();
                    bufferedWriter.write(result + "\n");
                    break;
                case 6:
                    result = queue.isEmpty() ? 1 : 0;
                    bufferedWriter.write(result + "\n");
                    break;
                case 7:
                    result = queue.isEmpty() ? -1 : queue.peek();
                    bufferedWriter.write(result + "\n");
                    break;
                case 8:
                    result = queue.isEmpty() ? -1 : queue.peekLast();
                    bufferedWriter.write(result + "\n");
                    break;
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
