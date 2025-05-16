package commands
import kotlin.random.Random
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class compulCommand {
    private val random = Random.Default

    fun execute(event: MessageReceivedEvent) {
    event.channel.sendMessage("(Geralmente, uma compulsão causa uma penalidade de -2 dados, conforme sua natureza)").queue()
    val rolada = random.nextInt(1,11)
    val mensagem =
        when (rolada) {
            in 1..3 -> "O seu Sangue se movimenta dentro do seu corpo morto, pedindo e clamando por mais energia. Seus músculos ficam mais cansados e sua mente, mais turva... _Compulsão de Fome_"
            in 4..5 -> "Você sente um desejo profundo e poderoso de predominar, controlar e possuir tudo o que está ao seu alcance... _Compulsão de Dominância_"
            in 6..7 -> "Seu corpo arde com uma sede insaciável por violência, levando-o a espalhar dor sem controle... _Compulsão de Dano_"
            in 8..9 -> "Como um animal selvagem, confuso e assustado, você se sente impelido à se afastar do perigo, à qualquer custo... _Compulsão de Paranoia_"
            in 10..10 -> "Uma maldição ancestral causada pelos seus mestres de eras passadas ecoa em suas veias e te domina... _Compulsão de Clã_ ( ** Pag 210** ) "
            else -> "🖕"
        }     
        
        event.channel.sendMessage(mensagem).queue()
    }
}
