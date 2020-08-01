class Garrafa {

    var tipo: String = ""
    var conteudo: Boolean = false
    var tipoConteudo: String = ""
    var cor: String = ""
    var vazio: Boolean = false

    fun encher() {
        this.conteudo = true
        this.vazio = false
    }

    fun esvaziar() {
        this.conteudo = false
        this.vazio = true
    }

    fun status() {
        println("TIPO: " + this.tipo)
        println("TEM CONTEÚDO: " + this.conteudo)
        println("TIPO CONTEÚDO: " + this.tipoConteudo)
        println("COR: " + this.cor)
        println("ESTÁ VAZIO: " + this.vazio)
        println("-------------------------- ++ --------------------------")
    }
}

fun main() {

    val cocaCola = Garrafa()
    cocaCola.tipo = "PET"
    cocaCola.conteudo
    cocaCola.tipoConteudo = "Refrigerante"
    cocaCola.cor = "Marrom Escuro"
    cocaCola.vazio

    cocaCola.status()

    cocaCola.encher()

    cocaCola.status()

    cocaCola.esvaziar()

    cocaCola.status()

}