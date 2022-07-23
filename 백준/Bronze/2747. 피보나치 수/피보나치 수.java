import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        int a = 0;
        int b = 1;

        while(count-- > 0) {
            int tmp = a;
            a = b;
            b = tmp + b;
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(a));
        writer.flush();
        writer.close();
    }
}
