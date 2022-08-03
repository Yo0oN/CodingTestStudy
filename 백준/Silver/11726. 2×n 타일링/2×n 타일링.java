import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 1. 입력될 값이 2 X N에서의 N이기 때문에 크기가 N+1인 배열을 만든다. (0은 2 X 0이 없으니까 제외)
        // 2. 초기값 설정
        // 3. 점화식 기반으로 계산값 적용하기
        // 4. 특정 입려값에 따른 계산값을 리스트에서 추출

        int N = Integer.parseInt(reader.readLine()); // N

        // 1. 배열생성 > 기존에는 N+1로 했으나 그럴경우 초기값 설정 시 ArrayIndexOutOfBoundsException 발생
        // 입력값은 1000까지이므로 배열 크기 고정
        int[] box = new int[1001];
        // 2. 초기값 설정
        box[1] = 1; // 2 x 1의 사각형에 2 X 1 크기의 타일을 채울수 있는 방법은 1개
        box[2] = 2; // 2 x 2의 사각형에 2 X 1 크기의 타일을 채울수 있는 방법은 2개 || 형태와 = 형태

        // 3. 점화식 기반 계산값 적용하기
        for (int index = 3; index < N + 1; index++) {
            box[index] = (box[index - 1] + box[index - 2]) % 10007;
        }

        // 4. 특정값에 대한 입력값에 따른 계산값을 리스트에서 추출
        int result = box[N];

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(result));
        writer.flush();
        writer.close();
    }
}
