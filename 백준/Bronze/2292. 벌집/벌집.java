import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int room = Integer.parseInt(bufferedReader.readLine());

        int roomCount = 1;
        int result = 1;
        while(roomCount < room) {
            roomCount += (6 * result);
            result++;
        }

        System.out.println(result);
    }
}
