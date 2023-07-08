import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while(true) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

            int a = Integer.parseInt(line.nextToken());
            int b = Integer.parseInt(line.nextToken());
            if (a == 0 && b == 0) {
                break;
            }

            String result = "neither";
            if (a < b) {
                if (b % a == 0) {
                    result = "factor";
                }
            } else {
                if (a % b == 0) {
                    result = "multiple";
                }
            }
            bufferedWriter.write(result + "\n");
        }
        bufferedWriter.close();
    }
}
