package commands
import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class eventoCommand {
    private val random = Random.Default

    fun execute(event: MessageReceivedEvent) {
        val rolada = random.nextInt(1,30)
        when (rolada){
            1 -> event.channel.sendMessage("noite").queue()
            2 -> event.channel.sendMessage("noite").queue()
            3 -> event.channel.sendMessage("noite").queue()
            4 -> event.channel.sendMessage("noite").queue()
            5 -> event.channel.sendMessage("noite").queue()
            6 -> event.channel.sendMessage("noite").queue()
            7 -> event.channel.sendMessage("noite").queue()
            8 -> event.channel.sendMessage("noite").queue()
            9 -> event.channel.sendMessage("noite").queue()
            10 -> event.channel.sendMessage("noite").queue()
            11-> event.channel.sendMessage("noite").queue()
            12 -> event.channel.sendMessage("noite").queue()
            13 -> event.channel.sendMessage("noite").queue()
            14 -> event.channel.sendMessage("noite").queue()
            15 -> event.channel.sendMessage("noite").queue()
            16 -> event.channel.sendMessage("noite").queue()
            17 -> event.channel.sendMessage("noite").queue()
            18 -> event.channel.sendMessage("noite").queue()
            19 -> event.channel.sendMessage("noite").queue()
            20 -> event.channel.sendMessage("noite").queue()
            21 -> event.channel.sendMessage("noite").queue()
            22 -> event.channel.sendMessage("noite").queue()
            23 -> event.channel.sendMessage("noite").queue()
            24 -> event.channel.sendMessage("noite").queue()
            25 -> event.channel.sendMessage("noite").queue()
            26 -> event.channel.sendMessage("noite").queue()
            27 -> event.channel.sendMessage("noite").queue()
            28 -> event.channel.sendMessage("noite").queue()
            29 -> event.channel.sendMessage("noite").queue()
            30 -> event.channel.sendMessage("noite").queue()
        }
    }
}
