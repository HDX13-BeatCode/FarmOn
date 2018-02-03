package io.beatcode.apps.farmon.data.model

/**
 * Created by hdx13 on 29/01/18.
 * Data class for chats
 */
data class Chats(
        val id: Long,
        val user1Id: Long,
        val user2Id: Long,
        val chatDetails: MutableList<ChatDetails> = ArrayList()
)