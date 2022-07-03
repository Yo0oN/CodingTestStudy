import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();
        
        for (int x = 0; x < count; x++) {
            int index = 0;
            LinkedList<Character> password = new LinkedList<>();
            char[] input = reader.readLine().toCharArray();
            
            for (int y = 0; y < input.length; y++) {
                char now = input[y];
                if (now == '<') {
                    index = index > 0 ? index - 1 : index;
                } else if (now == '>') {
                    index = index < password.size() ? index + 1 : index;
                } else if (now == '-') {
                    if (index > 0) {
                        password.remove(--index);
                    }
                } else {
                    password.add(index, now);
                    index++;
                }
            }
            
            Iterator<Character> iterator = password.iterator();
            
            while(iterator.hasNext()) {
                result.append(iterator.next());
            }
            result.append("\n");
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}