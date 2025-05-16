package commands
import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class compulCommand {
    private val random = Random.Default

    fun execute(event: MessageReceivedEvent) {
        val rolada = random.nextInt(1,10)
    val mensagem =
        when (rolada) {
            in 1..3 -> "O seu Sangue se movimenta dentro do seu corpo morto, pedindo e clamando por mais energia. Seus músculos ficam mais cansados e sua mente, mais turva... Compulsão de Fome"
            in 4..5 -> "Você sente um desejo profundo e poderoso de predominar, controlar e possuir tudo o que está ao seu alcance... Compulsão de Dominância"
            in 8..9 -> "Como um animal selvagem, confuso e assustado, você se sente impelido à se afastar do perigo, à qualquer custo... Compulsão de Paranoia"
            10 -> "Uma maldição ancestral causada pelos seus mestres de eras passadas ecoa em suas veias e te domina... Compulsão de Clã"
            else -> "🖕"
        }     
        
        event.channel.sendMessage(mensagem).queue()
    }
}
