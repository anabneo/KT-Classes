class Sentimento {

    var nome: String = ""
    var intensidade: String = ""
    var motivo: String = ""

    fun ficarNervoso() {
        this.nome = "Nervoso"
        this.intensidade = "10"
    }

    fun ficarFeliz() {
        this.nome = "Feliz"
        this.intensidade = "8"
    }


    fun status() {
        println("NOME: " + this.nome)
        println("INTENSIDADE: " + this.intensidade)
        println("MOTIVO: " + this.motivo)
        println("-------------------------- ++ --------------------------")
    }
}

fun main() {

    val pessoaFeelings = Sentimento()
    pessoaFeelings.nome = "Normal"
    pessoaFeelings.intensidade = "4"

    pessoaFeelings.status()

    pessoaFeelings.ficarFeliz()

    pessoaFeelings.status()

    pessoaFeelings.ficarNervoso()

    pessoaFeelings.status()

}