package commands
import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class FomeCommand {
    private val random = Random.Default

    fun execute(event: MessageReceivedEvent) {
        val rolada = random.nextInt(1, 11)

        if (rolada<6) {
            if (rolada==1) {
                event.channel.sendMessage("A ancestral maldição de Caim te chama para mais uma noite de carnificina").queue()
            } else if (rolada==2 || rolada==3){
                event.channel.sendMessage("Seu corpo morto reage, a besta escondida em suas veias uiva com rancor").queue()
            } else{
                event.channel.sendMessage("Você sente seu sangue borbulhar com desejo e vontade").queue()
            }
            event.channel.sendMessage("Sua _Fome_ aumenta em 1").queue()
        } else{
            event.channel.sendMessage("Você acorda de seu descanso, seu desejo ancestral suprimido, por enquanto...").queue()
            event.channel.sendMessage("Sua _Fome_ não aumenta esta noite").queue()
        } 
    }
}
