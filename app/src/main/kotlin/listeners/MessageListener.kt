package listeners

import commands.boaNoiteCommand
import commands.fomeCommand
import commands.skullCommand
import commands.fCommand
import commands.rollCommand
import commands.eventoCommand
import commands.ressonanciaCommand
import commands.frenzyCommand
import commands.helpCommand
import commands.compulCommand
import commands.regrasCommand
import kotlin.random.Random
import kotlin.math.log

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class MessageListener : ListenerAdapter() {
    private val random = Random.Default
    override fun onMessageReceived(event: MessageReceivedEvent) {
        if (event.author.isBot) return
        val message = event.message.contentRaw
        print(message)
        if(!message.contains(">vai"))return

        val chance = random.nextInt(1, 101)
        if (chance==69){
            event.channel.sendMessage("Não quero te responder essa noite").queue()
            val embed = EmbedBuilder()
                .setTitle("AUUUUUU!")
                .setImage("https://c.tenor.com/p51_dkd5c1oAAAAd/tenor.gif")
                .build()
            event.channel.sendMessageEmbeds(embed).queue()
            return
        }

        when {
            message.contains("boa", ignoreCase = true) -> boaNoiteCommand().execute(event)
            message.contains("compulsão", ignoreCase = true) -> compulCommand().execute(event)
            message.contains("evento", ignoreCase = true) -> eventoCommand().execute(event)
            message.contains("frenzy", ignoreCase = true) -> frenzyCommand().execute(event)
            message.contains("fome", ignoreCase = true) -> fomeCommand().execute(event)
            message.contains("help", ignoreCase = true) -> helpCommand().execute(event)
            message.contains("regras", ignoreCase = true) -> regrasCommand().execute(event)
            message.contains("resson", ignoreCase = true) -> ressonanciaCommand().execute(event)        
            message.contains("role", ignoreCase = true) -> rollCommand().execute(event)
            message.contains("💀", ignoreCase = true) -> skullCommand().execute(event)
            message.contains("F", ignoreCase = true) ->fCommand().execute(event)
            //message.contains("outro_comando", ignoreCase = true) -> OutroCommand().execute(event)
            else -> return 
        }
    }
}
