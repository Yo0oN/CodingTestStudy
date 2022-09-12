import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val X: Int = readLine().split(" ")[1].toInt()
    val A: List<String> = readLine().split(" ")

    for (i in A) {
        if (i.toInt() < X) {
            print("$i ")
        }
    }
}
