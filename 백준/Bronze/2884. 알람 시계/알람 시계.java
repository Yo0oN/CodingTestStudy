import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int hour = Integer.parseInt(tokenizer.nextToken());
        int min = Integer.parseInt(tokenizer.nextToken());

        min -= 45;
        hour = min < 0 ? (hour - 1 < 0 ? 23 : hour - 1) : hour;
        min = min < 0 ? min + 60 : min;

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(hour));
        writer.write(" ");
        writer.write(Integer.toString(min));
        writer.flush();
        writer.close();
    }
}
