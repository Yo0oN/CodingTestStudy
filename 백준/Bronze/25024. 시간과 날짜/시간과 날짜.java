import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < count; i++) {
            StringTokenizer line = new StringTokenizer(bufferedReader.readLine());

            int x = Integer.parseInt(line.nextToken());
            int y = Integer.parseInt(line.nextToken());
            String isTime = "No";
            if (x >= 0 && x <= 23 && y >= 0 && y <= 59) {
                isTime = "Yes";
            }
            String isDate = "No";
            if (x >= 1 && x <= 12 && y >= 1) {
                if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
                    if (y <= 31) {
                        isDate = "Yes";
                    }
                } else if (x == 2) {
                    if (y <= 29) {
                        isDate = "Yes";
                    }
                } else {
                    if (y <= 30) {
                        isDate = "Yes";
                    }
                }
            }
            bufferedWriter.write(isTime + " " + isDate + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
