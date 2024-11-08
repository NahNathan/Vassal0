package commands
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class boaNoiteCommand {
    fun execute(event: MessageReceivedEvent) {
        event.channel.sendMessage("noite").queue()
    }
}
