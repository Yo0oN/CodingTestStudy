import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count1 = Integer.parseInt(reader.readLine());

        int[] input = new int[count1];
        for (int x = 0; x < count1; x++) {
            input[x] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(input);

        StringBuilder result = new StringBuilder();
        for (int x = 0; x < count1; x++) {
            result.append(input[x]);
            if (x != count1 - 1) {
                result.append("\n");
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
