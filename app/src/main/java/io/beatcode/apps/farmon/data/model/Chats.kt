package io.beatcode.apps.farmon.data.model

/**
 * Created by hdx13 on 29/01/18.
 */
data class Chats(
        val id: Long,
        val user1Id: Long,
        val user2Id: Long,
        val chatContents: MutableList<ChatContent> = ArrayList()
)

data class ChatContent(
        val senderId: Long,
        val receiverId: Long,
        val content: String = ""
)