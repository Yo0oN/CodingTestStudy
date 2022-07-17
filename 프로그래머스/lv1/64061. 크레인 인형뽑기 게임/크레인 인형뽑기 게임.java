import java.util.Stack;

class Solution {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack();

        for (int x = 0; x < moves.length; x++) {
            int doll = 0;
            int line = moves[x] - 1;

            for (int y = 0; y < board.length; y++) {
                if (board[y][line] > 0) { // 인형이 있다면 stack에 추가, 뺀 자리를 0으로
                    doll = board[y][line];
                    board[y][line] = 0;
                    break;
                }
            }

            if (doll > 0) {
                if (!stack.isEmpty() && stack.peek() == doll) { // 집어넣을 인형이 이전 인형과 같다면 인형 삭제
                    stack.pop();
                    answer += 2;
                } else {
                    stack.add(doll);
                }
            }
        }

        return answer;
    }
}