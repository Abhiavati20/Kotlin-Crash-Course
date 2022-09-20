abstract class Animal(
    val name: String,
    val legCount: Int
) {
    init {
        println("$name is a animal of $legCount no of legs");
    }

    abstract fun makeSound();
}