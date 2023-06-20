import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int word = bufferedReader.readLine().charAt(0);
        System.out.println(word);
    }
}
