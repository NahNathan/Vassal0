package listeners

import commands.boaNoiteCommand
import commands.FomeCommand
import commands.skullCommand
import kotlin.random.Random

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class MessageListener : ListenerAdapter() {
    private val random = Random.Default
    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.author.isBot) return

        val chance = random.nextInt(1, 101)
        if (chance==69){
            event.channel.sendMessage("Não quero te responder essa noite").queue()
            val embed = EmbedBuilder()
                .setTitle("AUUUUUU!")
                .setImage("https://media1.tenor.com/m/p51_dkd5c1oAAAAd/werewolf.gif")
                .build()
            event.channel.sendMessageEmbeds(embed).queue()
            return
        }

        val message = event.message.contentRaw
        when {
            message.contains("boa", ignoreCase = true) -> boaNoiteCommand().execute(event)
            message.contains("fome", ignoreCase = true) -> FomeCommand().execute(event)
            message.contains("💀", ignoreCase = true) -> skullCommand().execute(event)
            //message.contains("outro_comando", ignoreCase = true) -> OutroCommand().execute(event)
            else -> return 
        }
    }
}
