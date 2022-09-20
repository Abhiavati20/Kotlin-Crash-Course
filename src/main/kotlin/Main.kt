fun main(args: Array<String>) {
    var x: Int =  10;

    println("The value of x is $x");

    x = 4;

    println("The value of x is now $x");

    val y = 10;
    println("$y");

//    y = 20;       error we cannot reinitialize the variable with datatype val

//    LONG
    val a = 3L;

//    DOUBLE (precise decimal)
    val b = 3.33;

//    FLOAT (floating numbers)
    val c = 3.33f;

//    BOOLEAN
    var iLovePizza = true;
    iLovePizza = false;

//    CHAR
    val iAmaChar = 'A';

//  Arithmetic operations

    var d = 3 * 4;
    println("$d");

    d = 3 + 4;
    println("$d");

    d = 3 - 4;
    println("$d")

    d = 3 % 4;
    println("$d");

    d = 3 / 4;
    println("$d");

    val preciseDivision  = 3f / 4f;
    println(preciseDivision);

//  LOGICAL OPERATIONS
    var amIAnAdult = true;
    var amIAnProgrammer = true;

    var amIAnAdultProgrammer = amIAnAdult && amIAnProgrammer;
    println(amIAnAdultProgrammer);

    amIAnAdult = false;
    amIAnAdultProgrammer = amIAnAdult || amIAnProgrammer;
    println(amIAnAdultProgrammer);

    amIAnAdultProgrammer = (amIAnAdult == amIAnProgrammer);
    println(amIAnAdultProgrammer);

    amIAnAdultProgrammer = !(amIAnProgrammer) != amIAnAdult;
    println(amIAnAdultProgrammer);

    val str = "Kotlin is the Best Language";
    println(str.toUpperCase());


//    if-else condition

    var num1 = 1 + 2;
    if(num1 == 2) {
        println("yes");
    }
    else if(num1 == 3) {
        println("num1 is $num1");
    }
    else {
        println("no");
    }


}