import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        String result = "Error";

        if (a + b + c == 180) {
            if (a == 60 && b == 60 && c == 60) {
                result = "Equilateral";
            } else if (a != b && a != c && b != c) {
                result = "Scalene";
            } else {
                result = "Isosceles";
            }
        }

        bufferedWriter.write(result);
        bufferedWriter.close();
    }
}
