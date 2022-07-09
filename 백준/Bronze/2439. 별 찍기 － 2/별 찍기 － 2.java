import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();

        for (int x = 1; x <= input; x++) {
            for (int y = 1; y <= input - x; y++) {
                result.append(" ");
            }
            for (int z = 1; z <= x; z++) {
                result.append("*");
            }
            if (x != input) {
                result.append("\n");
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
