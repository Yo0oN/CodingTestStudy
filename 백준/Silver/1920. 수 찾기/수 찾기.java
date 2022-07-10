import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count1 = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x = 0; x < count1; x++) {
            int number = Integer.parseInt(tokenizer.nextToken());
            map.put(number, number);
        }

        int count2 = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());

        StringBuilder result = new StringBuilder();
        for (int x = 0; x < count2; x++) {
            int number = Integer.parseInt(tokenizer.nextToken());

            if (map.get(number) == null) {
                result.append(0);
            } else {
                result.append(1);
            }

            if (x != count2) {
                result.append("\n");
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
