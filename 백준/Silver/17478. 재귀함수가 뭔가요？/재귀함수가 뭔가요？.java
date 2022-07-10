import java.io.*;

public class Main {
    public static int recursive;
    public static StringBuilder result;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        recursive = Integer.parseInt(reader.readLine());

        result = new StringBuilder();
        result.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        result.append("\n");
        Main.recursive(0);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }

    public static void recursive(int x) {
        StringBuilder bar = new StringBuilder("");
        for (int y = 0; y < x; y++) {
            bar.append("____");
        }

        result.append(bar);
        result.append("\"재귀함수가 뭔가요?\"");
        result.append("\n");

        if (x == recursive) {
            result.append(bar);
            result.append("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            result.append("\n");
            result.append(bar);
            result.append("라고 답변하였지.");
            result.append("\n");
            return;
        } else {
            result.append(bar);
            result.append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            result.append("\n");
            result.append(bar);
            result.append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            result.append("\n");
            result.append(bar);
            result.append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            result.append("\n");
        }

        recursive(x + 1);
        result.append(bar);
        result.append("라고 답변하였지.");
        result.append("\n");
    }
}
