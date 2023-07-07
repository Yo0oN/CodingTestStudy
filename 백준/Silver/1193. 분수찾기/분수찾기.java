import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int X = Integer.parseInt(bufferedReader.readLine());
        int n = 0;
        while(n * (n + 1) < 2 * X) {
            n++;
        }
        int k = n * (n + 1) / 2;
        int a = 1;
        int b = n;
        while (k > X) {
            k--;
            a++;
            b--;
        }
        if (n % 2 == 1) {
            System.out.println(a + "/" + b);
        } else {
            System.out.println(b + "/" + a);
        }
    }
}
