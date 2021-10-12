class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] num = Integer.toString(x).split("");
        int hap = 0;
        for (String n : num) {
            hap += Integer.parseInt(n);
        }
        if (x % hap != 0) {
            answer = false;
        }
        return answer;
    }
}
