package listeners

import commands.boaNoiteCommand
import commands.FomeCommand
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class MessageListener : ListenerAdapter() {
    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.author.isBot) return
        val message = event.message.contentRaw
        when {
            message.contains("boa", ignoreCase = true) -> boaNoiteCommand().execute(event)
            message.contains("fome", ignoreCase = true) -> FomeCommand().execute(event)
            //message.contains("outro_comando", ignoreCase = true) -> OutroCommand().execute(event)
            else -> return // Nenhum comando correspondente
        }
    }
}
