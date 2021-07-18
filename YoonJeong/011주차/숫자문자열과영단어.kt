class Solution {
    fun solution(s: String): Int {
        var ss = s
        var alpha: Array<String> = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        for (i in 0..9) {
            ss = ss.replace(alpha[i], "${i}")
        }

        return ss.toInt()
    }
}
