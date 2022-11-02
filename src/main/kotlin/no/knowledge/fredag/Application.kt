package no.knowledge.fredag

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    println("hello!")

    embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText("hello, bastard!")
            }
        }
    }.start(wait = true)
}
