import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(bufferedReader.readLine());
            if (x == 0) {
                if (heap.isEmpty()) {
                    bufferedWriter.write(String.valueOf(0));
                } else {
                    bufferedWriter.write(String.valueOf(heap.poll()));
                }
                bufferedWriter.write("\n");
            } else {
                heap.add(x);
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
