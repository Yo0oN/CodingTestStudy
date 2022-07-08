import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet();
        for (int x = 0; x < 10; x++) {
            int inputL = Integer.parseInt(reader.readLine()) % 42;

            set.add(inputL);
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(set.size()));
        writer.flush();
        writer.close();
    }
}
