import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bufferedReader.readLine());
        int result1 = (int) (n * 0.78);
        int result2 = (int) (n - ((n * 0.20) * 0.22));
        System.out.println(result1 + " " + result2);
    }
}
