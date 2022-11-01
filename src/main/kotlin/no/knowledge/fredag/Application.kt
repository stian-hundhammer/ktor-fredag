package no.knowledge.fredag

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    println("hello!")
    embeddedServer(Netty, port = 8080, host = "localhost") {
        configureRouting()
        println("configure now, baby!")
    }.start(wait = true)
}

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("hello, bastard!")
        }
    }
}
