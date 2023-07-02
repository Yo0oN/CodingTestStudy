import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        int result = 0;
        for(int i = 0; i < count; i++) {
            char[] word = bufferedReader.readLine().toCharArray();
            Set<Character> letterSet = new HashSet();

            char nowLetter = word[0];
            letterSet.add(word[0]);
            int isGroup = 1;
            for (char letter : word) {
                if (nowLetter != letter && letterSet.contains(letter)) { // 현재단어가 직전단어랑 다른데 이미 set에 있으면 그룹이 아님
                    isGroup = 0;
                    break;
                } else if (nowLetter != letter) { // 현재 단어가 직전 단어랑 다르고 set에 없으면 패스
                    nowLetter = letter;
                    letterSet.add(letter);
                }
            }
            result += isGroup;
        }
        System.out.println(result);
    }
}
