package no.knowledge.fredag.model

import java.time.LocalDateTime

data class Comment(
    val id: Long,
    val userName: String,
    val text: String,
    val timestamp: LocalDateTime,
)
