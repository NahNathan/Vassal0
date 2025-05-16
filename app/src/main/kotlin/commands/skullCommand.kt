package commands
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class skullCommand {
    fun execute(event: MessageReceivedEvent) {
        val embed1 = EmbedBuilder()
                .setTitle("💀")
                .setImage("https://c.tenor.com/ieXO0Ui-EoMAAAAd/tenor.gif")
                .build()
            event.channel.sendMessageEmbeds(embed1).queue()
        val embed2 = EmbedBuilder()
            .setTitle("💀")
            .setImage("https://c.tenor.com/fktkLkfB4i4AAAAd/tenor.gif")
            .build()
        event.channel.sendMessageEmbeds(embed2).queue()
        val embed3 = EmbedBuilder()
                .setTitle("💀")
                .setImage("https://c.tenor.com/tNfzy9M48V8AAAAd/tenor.gif")
                .build()
            event.channel.sendMessageEmbeds(embed3).queue()
            val embed4 = EmbedBuilder()
                .setTitle("💀")
                .setImage("https://c.tenor.com/MVpfNx2QgFwAAAAd/tenor.gif")
                .build()
            event.channel.sendMessageEmbeds(embed4).queue()
            val embed5 = EmbedBuilder()
                .setTitle("💀")
                .setImage("https://c.tenor.com/iSGz_BU9ZRoAAAAd/tenor.gif")
                .build()
            event.channel.sendMessageEmbeds(embed5).queue()
    }
}
