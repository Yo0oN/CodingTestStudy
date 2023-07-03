import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder move = new StringBuilder();
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        int circle = Integer.parseInt(bufferedReader.readLine());
        hanoi(circle, 1, 3, 2);
        bufferedWriter.write(count + "\n");
        bufferedWriter.write(move.toString());
        bufferedWriter.close();
    }
    private static void hanoi(int circle, int from, int to, int sub) {
        if (circle == 1) {
            move.append(from + " " + to + "\n");
            count++;
        } else {
            hanoi(circle - 1, from, sub, to);
            move.append(from + " " + to + "\n");
            count++;
            hanoi(circle - 1, sub, to, from);
        }
    }
}
