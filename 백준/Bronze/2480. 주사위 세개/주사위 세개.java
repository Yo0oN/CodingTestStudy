import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int[] dices = new int[3];

        for (int x = 0; x < 3; x++) {
            dices[x] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(dices);

        int result = 0;
        if (dices[0] == dices[1] && dices[1] == dices[2]) {
            result = dices[0] * 1000 + 10000;
        } else if (dices[0] != dices[1] && dices[1] != dices[2]) {
            result = dices[2] * 100;
        } else {
            result = dices[1] * 100 + 1000;
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(result));
        writer.flush();
        writer.close();
    }
}
