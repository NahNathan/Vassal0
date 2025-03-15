package commands
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class skullCommand {
    fun execute(event: MessageReceivedEvent) {
        val embed1 = EmbedBuilder()
                .setTitle("💀")
                .setImage("https://media1.tenor.com/m/ieXO0Ui-EoMAAAAd/skull-explode.gif")
                .build()
            event.channel.sendMessageEmbeds(embed1).queue()
        val embed2 = EmbedBuilder()
            .setTitle("💀")
            .setImage("https://media1.tenor.com/m/fktkLkfB4i4AAAAd/spinning-skull-skull.gif")
            .build()
        event.channel.sendMessageEmbeds(embed2).queue()
        val embed3 = EmbedBuilder()
                .setTitle("💀")
                .setImage("https://media1.tenor.com/m/tNfzy9M48V8AAAAd/skull-issues.gif")
                .build()
            event.channel.sendMessageEmbeds(embed3).queue()
            val embed4 = EmbedBuilder()
                .setTitle("💀")
                .setImage("https://media1.tenor.com/m/MVpfNx2QgFwAAAAd/skeleton.gif")
                .build()
            event.channel.sendMessageEmbeds(embed4).queue()
            val embed5 = EmbedBuilder()
                .setTitle("💀")
                .setImage("https://media1.tenor.com/m/iSGz_BU9ZRoAAAAd/skeleton-falling.gif")
                .build()
            event.channel.sendMessageEmbeds(embed5).queue()
    }
}
