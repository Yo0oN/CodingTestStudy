import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();

        for (int x = 1; x < 10; x++) {
            result.append(input);
            result.append(" * ");
            result.append(x);
            result.append(" = ");
            result.append(input * x);
            if (x != 9) {
                result.append("\n");
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
