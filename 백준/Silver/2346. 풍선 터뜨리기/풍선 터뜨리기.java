import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        Deque<Balloon> balloons = new ArrayDeque<>();
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            balloons.add(new Balloon(i + 1, Integer.parseInt(line.nextToken())));
        }
        int index = 0;
        for (int i = 0; i < N; i++) {
            Balloon now = balloons.poll();
            bufferedWriter.write(now.index + " ");
            int value = now.value;
            if (i < N - 1) {
                if (value < 0) {
                    while(value++ < 0) {
                        balloons.addFirst(balloons.pollLast());
                    }
                } else {
                    value--;
                    while(value-- > 0) {
                        balloons.addLast(balloons.pollFirst());
                    }
                }
            }
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static class Balloon {
        int index;
        int value;

        public Balloon(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
