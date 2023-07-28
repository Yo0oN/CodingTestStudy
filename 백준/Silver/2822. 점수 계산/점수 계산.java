import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[][] scores = new int[8][3];
        for (int i = 0; i < 8; i++) {
            scores[i][0] = Integer.parseInt(bufferedReader.readLine());
            scores[i][1] = i + 1;
        }

        Arrays.sort(scores, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += scores[i][0];
            numbers[i] = scores[i][1];
        }

        bufferedWriter.write(String.valueOf(sum) + "\n");
        Arrays.sort(numbers);
        for (int number : numbers) {
            bufferedWriter.write(String.valueOf(number) + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
