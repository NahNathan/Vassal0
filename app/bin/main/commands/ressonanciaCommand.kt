package commands
import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class ressonanciaCommand {
    private val random = Random.Default

    fun execute(event: MessageReceivedEvent) {
        val rolada = random.nextInt(1,30)
        when (rolada){
            1 -> event.channel.sendMessage("noite").queue()
            2 -> event.channel.sendMessage("noite").queue()
    }
}
