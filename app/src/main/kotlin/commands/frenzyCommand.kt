package commands

import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class frenzyCommand {
    private val random = Random.Default

    fun execute(event: MessageReceivedEvent) {
        val message = event.message.contentRaw

        val match = Regex("frenzy (\\d+)").find(message)
        if (match == null) {
            event.channel.sendMessage("Digitou errado. Use: frenzy <número de dados>").queue()
            return
        }

        val (pool) = match.destructured
        val dicePool = pool.toIntOrNull() ?: return

        if (dicePool <= 0) {
            event.channel.sendMessage("Hmm, parece ser inválido. O número de dados deve ser maior que 0.").queue()
            return
        }

        // Rolar os dados
        val results = List(dicePool) { random.nextInt(1, 11) }

        // Contagem de sucessos e críticos
        val successes = results.count { it >= 6 }
        val criticals = results.count { it == 10 } / 2 
        val totalSuccesses = successes + (criticals * 2)

        val resultMessage = StringBuilder()
        resultMessage.append("🎲 **Teste de Frenezi:**\n")
        resultMessage.append("🩸Dados: ${results.joinToString("  ")}\n")
        resultMessage.append("🦇Sucessos: **$totalSuccesses**\n")
        event.channel.sendMessage(resultMessage.toString()).queue()
    }
}
