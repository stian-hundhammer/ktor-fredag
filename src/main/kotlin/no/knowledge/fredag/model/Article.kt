package no.knowledge.fredag.model

/**
 * Hold an article.
 */
data class Article(
    val id: Long,
    val header: String,
    val body: String,
    val comments: List<Comment>,
)
