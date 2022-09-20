// kotlin is a null safe language
fun main() {
    val a = 10;
    val b = if(a == 10) 20 else 10;
    println(b);

//    val userInput1 = readLine();
//    val userInput2 = readLine();
//    val result = userInput1!!.toInt() + userInput2!!.toInt();
//    println(result);
//
//    val ui3 = readLine() ?: "0";
//    val ui4 = readLine() ?: "0";
//
//    val res1 = ui3.toInt() + ui4.toInt();
//    println(res1);

//    immutable list
    val shoppingList = listOf<String>("Lambo","penthouse","rolex");
    println(shoppingList[0]);
    println(shoppingList[2]);

//    mutable list
    val shoppingList1 = mutableListOf<String>("Lambo","PentHouse","Rolex");
    shoppingList1.add("Thar");
    println(shoppingList1[3]);

    var counter = 0;
    while(counter < shoppingList1.size) {
        println(shoppingList1[counter]);
        counter += 1;
    }

    for(shoppingItem in shoppingList) {
        println(shoppingItem);
    }

    for(i in 1..10){
        println(i);
    }

//    when expression
    var x = 5;
    when(x) {
        in 1..2 -> println("x in the range 1 to 2");
        in 3..10 -> println("x in the range between 3 and 10");
        else -> {
            println("x is not in the range 1 to 10");
        }
    }
}