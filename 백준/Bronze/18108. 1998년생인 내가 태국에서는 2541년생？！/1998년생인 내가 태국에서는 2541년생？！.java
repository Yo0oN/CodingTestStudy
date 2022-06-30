import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int year = Integer.parseInt(reader.readLine());
        
        System.out.println(year - 543);
    }
}