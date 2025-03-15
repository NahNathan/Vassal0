package commands
import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class helpCommand {
    fun execute(event: MessageReceivedEvent) {
        event.channel.sendMessage("Bem vindo ao Vassal0, estou ao seu comando \n").queue()
        event.channel.sendMessage("Para enviar algum comando, use o '>vai ' seguido por algum comando: \n").queue()
        event.channel.sendMessage(">vai { boa } \n").queue()
        event.channel.sendMessage(">vai { evento } \n").queue()
        event.channel.sendMessage(">vai { frenzy } { Dados A Serem Rolados } \n").queue()
        event.channel.sendMessage(">vai { fome } \n").queue()
        event.channel.sendMessage(">vai { F } \n").queue()
        event.channel.sendMessage(">vai { help } \n").queue()
        event.channel.sendMessage(">vai { resson } \n").queue()
        event.channel.sendMessage(">vai { role { Dados A Serem Rolados } { Dados de Fome }} \n").queue()
        event.channel.sendMessage(">vai { :skull: } \n").queue()
    }
}
