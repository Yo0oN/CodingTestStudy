import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        int result = 0;
        Set<String> chats = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String chat = bufferedReader.readLine();

            if (chat.equals("ENTER")) {
                result += chats.size();
                chats.clear();
            } else {
                chats.add(chat);
            }
        }
        result += chats.size();
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
