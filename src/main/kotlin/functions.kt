fun main() {
    print10Numbers();
    val evenorOdd = isEven(13);
    println(evenorOdd);

    println(isEven(200));
    println(isEven(number=251));

    println(withDefault(15))

    println(3.isOdd());
}

fun Int.isOdd(): Boolean {
    return this % 2 == 1;
}

fun withDefault(number: Int = 10): Boolean {
    return number % 2 == 0;
}

fun isEven(number: Int): Boolean {
    if(number % 2 == 0) return true;
    return false;
}

fun print10Numbers() {
    for(i in 1..10) {
        println(i);
    }
}