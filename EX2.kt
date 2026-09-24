class Personne {
    var nom = "Ali"
    var prenom = "Ahmed"
    var adresse = "Rabat"
    var age = 20

    fun UpdateNom(n: String) {
        nom = n
    }

    fun UpdatePrenom(p: String) {
        prenom = p
    }

    fun UpdateAge(a: Int) {
        age = a
    }

    fun UpdateAdresse(a: String) {
        adresse = a
    }

    fun affiche() {
        println(nom)
        println(prenom)
        println(adresse)
        println(age)
    }
}

fun main() {
    var p = Personne()
    p.affiche()
}