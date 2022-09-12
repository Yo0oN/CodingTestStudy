import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> set = new HashSet<>();

        // 10000까지 숫자 추가
        for (int x = 1; x <= 10000; x++) {
            set.add(x);
        }

        for (int x = 1; x <= 10000; x++) {
            int num = x;

            if (!set.contains(num)) { // set에 숫자가 없으면, 해당 수로 만들어진 수열들도 모두 없을테니 다음수로
                continue;
            }

            while(true) {
                char[] numArray = Integer.toString(num).toCharArray();
                for (char n : numArray) {
                    num += Character.getNumericValue(n);
                }
                if (num > 10000) { // 10000 넘어가면 중단
                    break;
                }
                set.remove(num); // 수열 제거
            }
        }
        StringBuilder result = new StringBuilder();

        for (Integer n : set) {
            result.append(n);
            result.append('\n');
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(result.toString());
        writer.flush();
        writer.close();
    }
}
