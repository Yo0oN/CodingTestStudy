import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        while (true) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(line.nextToken());
            int b = Integer.parseInt(line.nextToken());
            int c = Integer.parseInt(line.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            String result = "Invalid";
            if (isTriangle(a, b, c)) {
                if (a == b && b == c && c == a) {
                    result = "Equilateral";
                } else if (a != b && a != c && b != c) {
                    result = "Scalene";
                } else {
                    result = "Isosceles";
                }
            }

            bufferedWriter.write(result + "\n");
        }
        bufferedWriter.close();
    }

    private static boolean isTriangle(int a, int b, int c) {
        boolean isTriangle = true;
        int[] sort = {a, b, c};
        Arrays.sort(sort);
        if (sort[0] + sort[1] <= sort[2]) {
            isTriangle = false;
        }
        return isTriangle;
    }
}
