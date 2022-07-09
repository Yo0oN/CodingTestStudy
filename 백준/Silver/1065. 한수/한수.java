import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        int result = 0;
        if (input < 100) {
            result = input;
        } else {
            result = 99;
            for (int x = 100; x <= input; x++) {
                int one = x / 100;
                int two = (x % 100) / 10;
                int three = (x % 100) % 10;
                if (one - two == two - three) {
                    result += 1;
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(result));
        writer.flush();
        writer.close();
    }
}
