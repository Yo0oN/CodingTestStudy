import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val len = readLine().toInt()

    for (i in 0 until len) {
        val case = readLine()
        var score = 0
        var chain = 1
        for (j in case) {
            if (j == 'O') {
                score += chain
                chain++
            } else {
                chain = 1
            }
        }
        println(score)
    }
}
