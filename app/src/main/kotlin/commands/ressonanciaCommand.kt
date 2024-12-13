package commands
import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class ressonanciaCommand {
    private val random = Random.Default
    fun execute(event: MessageReceivedEvent) {
        val temperamento = random.nextInt(1, 11)
        val ressonancia = random.nextInt(1, 11)
        val mensagem =
                when (ressonancia) {
                    in 1..3 -> ": Ressonância Fleumática"
                    in 4..6 -> ": Ressonância Melancólica"
                    in 7..8 -> ": Ressonância Colérica"
                    in 9..10 -> ": Ressonância Sanguínea"

                    else -> "🖕"
                } +
                        when (temperamento) {
                            in 1..5 -> " Bem balanceada, Ressonância insignificante"
                            in 6..8 -> " Passageira"
                            in 9..10 -> {
                                val novaRolagem = random.nextInt(1, 11)
                                when (novaRolagem) {
                                    in 1..8 ->
                                            " Intensa!! (dado adicional à roladas de disciplinas relacionadas)"
                                    in 9..0 ->
                                            " Aguda!! (dado adicional à roladas de disciplinas relacionadas & Dicrasia)"
                                    else -> "🖕"
                                }
                            }
                            else -> "🖕"
                        }
        event.channel.sendMessage(mensagem).queue()
    }
}
