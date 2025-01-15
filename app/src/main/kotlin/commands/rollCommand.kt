package commands

import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class rollCommand {
    private val random = Random.Default

    fun execute(event: MessageReceivedEvent) {
        val message = event.message.contentRaw

        val match = Regex("role (\\d+) (\\d+)").find(message)
        if (match == null) {
            event.channel.sendMessage("Formato incorreto. Use: role <número de dados> <dados de fome>").queue()
            return
        }

        val (pool, hunger) = match.destructured
        val dicePool = pool.toIntOrNull() ?: return
        val hungerDice = hunger.toIntOrNull() ?: return

        if (dicePool <= 0 || hungerDice < 0 || hungerDice > dicePool) {
            event.channel.sendMessage("Quantidade inválida de dados ou dados de fome.").queue()
            return
        }

        
        val results = List(dicePool) { random.nextInt(1, 11) }
        val hungerResults = results.take(hungerDice)

        
        var successes = results.count { it >= 6 }
        val criticals = results.filter { it == 10 }.size
        val hungerCriticals = hungerResults.filter { it == 10 }.size
        val ones = hungerResults.count { it == 1 }

        // Determine outcomes
        val totalCriticals = criticals / 2 
        successes += totalCriticals * 2

        val messyCritical = hungerCriticals >= 2
        val bestialFailure = ones > 0 && successes == 0

        
        val resultMessage = StringBuilder()
        resultMessage.append("🎲 Resultado dos dados:\n")
        resultMessage.append("Dados: ${results.joinToString(", ")}\n")
        resultMessage.append("Sucessos: $successes\n")
        if (totalCriticals > 0) resultMessage.append("Críticos: $totalCriticals\n")
        if (messyCritical) resultMessage.append("⚠️ Crítico Sujo!\n")
        if (bestialFailure) resultMessage.append("☠️ Falha Bestial!\n")

        event.channel.sendMessage(resultMessage.toString()).queue()
    }
}
