import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent
import listeners.MessageListener

fun main() {
    val token = "" 
    val jda = JDABuilder.createDefault(token)
        .enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT)
        .addEventListeners(MessageListener())
        .build()

    jda.awaitReady() 
    println("🦇🦇Vassal0 Pronto🦇🦇")
}
