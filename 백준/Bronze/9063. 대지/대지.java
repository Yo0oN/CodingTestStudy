import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bufferedReader.readLine());
        if (n <= 1) {
            System.out.println(0);
            return;
        }

        int[] xArray = new int[n];
        int[] yArray = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xArray[i] = x;
            yArray[i] = y;
        }
        Arrays.sort(xArray);
        Arrays.sort(yArray);
        int result = (xArray[n - 1] - xArray[0]) * (yArray[n - 1] - yArray[0]);
        System.out.println(result);
    }
}
