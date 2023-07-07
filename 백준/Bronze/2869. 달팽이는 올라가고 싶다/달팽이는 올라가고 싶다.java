import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

        int A = Integer.parseInt(line.nextToken()); // 낮에 올라가는 높이
        int B = Integer.parseInt(line.nextToken()); // 미끄러지는 높이
        int V = Integer.parseInt(line.nextToken()); // 높이

        int day = (int) Math.ceil((double)(V - A) / (double)(A - B));
        System.out.println(day + 1);
    }
}
