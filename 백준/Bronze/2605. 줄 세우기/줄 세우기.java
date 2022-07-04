import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine()); // 학생 수
        String[] strStudent = reader.readLine().split(" "); // 학생이 뽑은 번호

        LinkedList<Integer> line = new LinkedList<>();
        int index = 0; // 현재 학생의 번호
        for (int x = 0; x < N; x++) {
            int number = Integer.parseInt(strStudent[x]); // 현재학생이 뽑은 번호

            line.add(index - number, ++index);
        }


        StringBuffer result = new StringBuffer();
        line.forEach((i) -> {
            result.append(i);
            result.append(" ");
        });

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
