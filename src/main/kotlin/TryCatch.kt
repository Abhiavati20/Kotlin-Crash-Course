//try Catch implementation
fun main() {
    val num1 = readLine() ?: "0";
    var parsedNum1 = try {
        num1.toInt()
    } catch(e:Exception) {
        0
    }
    println(parsedNum1);
}