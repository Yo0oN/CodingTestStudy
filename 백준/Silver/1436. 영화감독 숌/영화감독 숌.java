import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(bufferedReader.readLine());
        int idx = 1;
        int result = 666;
        while(idx != n) {
            result++;
            String strResult = String.valueOf(result);
            if (strResult.contains("666")) {
                idx++;
            }
        }
        System.out.println(result);
    }
}
