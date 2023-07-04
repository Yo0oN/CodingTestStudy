import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int result = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < 9; j++) {
                int now = Integer.parseInt(line.nextToken());
                if (now > result) {
                    result = now;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        if (x == 0 && y == 0) {
            x = 1;
            y = 1;
        }
        System.out.println(result);
        System.out.println(x + " " + y);
    }
}
