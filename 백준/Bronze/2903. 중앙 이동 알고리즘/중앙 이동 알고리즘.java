import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());

        int dots = 2;
        for (int i = 0; i < N; i++) {
            dots += (dots - 1);
        }

        System.out.println(dots * dots);
    }
}
