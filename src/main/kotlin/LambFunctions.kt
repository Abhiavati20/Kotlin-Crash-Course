fun main() {
    val list = listOf("kotlin","is","fun");
    val count = list.customCount {
        currentString -> currentString.length >= 3
    }
    println(count);
}

fun <T> List<T>.customCount(function: (String) -> Boolean): Int{
    var counter = 0;
    for(item in this) {
        if(function(item)){
            println(item);
            counter += 1;
        }
    }
    return counter;
}