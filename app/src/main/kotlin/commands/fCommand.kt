package commands
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class fCommand {
    fun execute(event: MessageReceivedEvent) {
        event.channel.sendMessage("Respeitos Dados").queue()
    }
}