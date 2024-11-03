import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

fun main() {
    val token = "" 
    val jda = JDABuilder.createDefault(token)
        .addEventListeners(MessageListener())
        .build()
    jda.awaitReady()
}


class MessageListener : ListenerAdapter() {
    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.author.isBot) return
        val message = event.message.contentRaw
        println("Mensagem recebida: $message")

        if (message.contains("boa", ignoreCase = true)) {
            event.channel.sendMessage("noite").queue()
        }
    }
}