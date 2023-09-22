import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                }
                return Math.abs(o1) - Math.abs(o2);
            }
        });

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
