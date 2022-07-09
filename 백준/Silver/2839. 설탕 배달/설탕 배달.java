import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());

        int result = -1;
        if (input % 5 == 0){
            result = input / 5;
        } else if ((input != 4 && input != 7) && (input % 5 == 1 || input % 5 == 3)) {
            result = input / 5 + 1;
        } else if ((input != 4 && input != 7) && (input % 5 == 2 || input % 5 == 4)) {
            result = input / 5 + 2;
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(result));
        writer.flush();
        writer.close();
    }
}
