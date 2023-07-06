import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        int[][] white = new int[100][100];
        for (int i = 0; i < count; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

            int x = Integer.parseInt(line.nextToken());
            int y = Integer.parseInt(line.nextToken());
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    white[x + j][y + k] = 1;
                }
            }
        }

        int result = 0;
        for (int[] i : white) {
            for (int j : i) {
                result += j;
            }
        }
        System.out.println(result);
    }
}
