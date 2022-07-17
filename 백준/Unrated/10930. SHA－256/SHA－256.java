import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        MessageDigest crypto = MessageDigest.getInstance("SHA-256");
        crypto.update(input.getBytes());
        
        StringBuilder result = new StringBuilder();
        
        byte[] bytes = crypto.digest();
        
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
