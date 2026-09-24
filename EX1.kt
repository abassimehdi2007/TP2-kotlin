class MaClasse {
    val x = 23
    val y = x + 5

    fun affiche() {
        println(x)
        println(y)
    }
}

fun main() {
    val m = MaClasse()
    m.affiche()
}