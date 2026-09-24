```kotlin
class Car(
    var marque: String,
    var modele: String,
    var couleur: String,
    var kilometrage: Int
) {

    fun UpdateMarque(m: String) {
        marque = m
    }

    fun UpdateModele(m: String) {
        modele = m
    }

    fun UpdateCouleur(c: String) {
        couleur = c
    }

    fun UpdateKilometrage(k: Int) {
        kilometrage = k
    }

    fun affiche() {
        println("Marque : $marque")
        println("Modele : $modele")
        println("Couleur : $couleur")
        println("Kilometrage : $kilometrage")
    }
}
