import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int hour = Integer.parseInt(tokenizer.nextToken());
        int min = Integer.parseInt(tokenizer.nextToken());
        int plusMin = Integer.parseInt(reader.readLine());

        int resultMin = (min + plusMin) % 60;
        int resultHour = (((min + plusMin) / 60) + hour) % 24;

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(resultHour));
        writer.write(" ");
        writer.write(Integer.toString(resultMin));
        writer.flush();
        writer.close();
    }
}
