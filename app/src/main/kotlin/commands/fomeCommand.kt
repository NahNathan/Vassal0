package commands
import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class FomeCommand {
    private val random = Random.Default

    fun execute(event: MessageReceivedEvent) {
        val rolada = random.nextInt(1, 11)

        if (rolada > 5) {
            if (rolada % 3 == 1) {
                event.channel.sendMessage("A ancestral maldição de Caim te chama para mais carnificina").queue()
            } else if (rolada % 2 == 1){
                event.channel.sendMessage("Seu corpo morto reage, a besta escondida em suas veias uiva com rancor").queue()
            } else{
                event.channel.sendMessage("Você sente seu sangue borbular com desejo e vontade").queue()
            }
            event.channel.sendMessage("Sua fome aumenta em 1 esta noite").queue()
        } else{
            event.channel.sendMessage("Você acorda de seu descanso, seu desejo ancestral suprimido, por enquanto...").queue()
            event.channel.sendMessage("Sua fome não aumenta esta noite").queue()
        } 
    }
}
