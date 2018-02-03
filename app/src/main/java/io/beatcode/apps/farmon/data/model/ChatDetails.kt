package io.beatcode.apps.farmon.data.model

/**
 * Created by hdx13 on 31/01/18.
 * Content details of a chat,
 * @property senderId The user ID for sender
 * @property receiverId The user ID for receiver
 * @property content The content of the chat from [senderId] to [receiverId]
 */
data class ChatDetails(
        val senderId: Long,
        val receiverId: Long,
        val content: String = ""
)