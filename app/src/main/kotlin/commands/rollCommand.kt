package commands
import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class rollCommand {
    fun execute(event: MessageReceivedEvent) {
        event.channel.sendMessage("noite").queue()
    }
}
