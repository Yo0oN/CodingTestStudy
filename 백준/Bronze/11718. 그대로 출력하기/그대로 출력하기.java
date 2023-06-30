import java.io.*;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s;
        while((s = bufferedReader.readLine()) != null){
            System.out.println(s);
        }
    }
}
