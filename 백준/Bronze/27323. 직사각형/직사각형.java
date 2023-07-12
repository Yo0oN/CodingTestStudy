import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int A = Integer.parseInt(bufferedReader.readLine());
        int B = Integer.parseInt(bufferedReader.readLine());
        System.out.println(A * B);
    }
}
