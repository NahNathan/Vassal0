package commands

import net.dv8tion.jda.api.events.message.MessageReceivedEvent

class helpCommand {
    fun execute(event: MessageReceivedEvent) {
        val helpMessage = """
            🦇 Bem-vindo ao Vassal0, estou ao seu comando
            
            Use **>vai** seguido de um comando:
            **>vai { boa }** – o Vassal0 te dá um 'boa noite'
            **>vai { evento }** – gera um evento noturno aleatório
            **>vai { frenzy } {dados}** – faz um teste para ver se seu vampiro entra em Frenezi
            **>vai { fome }** – faz um teste de despertar, para ver se sua fome irá aumentar
            **>vai { F }** – presta seus respeitos
            **>vai { help }** – mostra a lista de comandos
            **>vai { resson }** – determina a ressonância do sangue de um mortal aleatório
            **>vai { role } {dados} {dados de fome}** – faz uma rolada normal, considerando sua fome
            **>vai { :skull: }** – Squeleto
        """.trimIndent()

        event.channel.sendMessage(helpMessage).queue()
    }
}
