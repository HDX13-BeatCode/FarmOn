package io.beatcode.apps.farmon.data.model

import java.util.ArrayList

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val chatItems: MutableList<Chats> = ArrayList()

    init {
        chatItems.add(Chats(0, 1, 2))

        with(chatItems[0].chatDetails) {
            add(ChatDetails(1, 2, "How many is the bananas?"))
            add(ChatDetails(2, 1, "About 20 kg"))

        }

        chatItems.add(Chats(1, 1, 3))

        with(chatItems[1].chatDetails) {
            add(ChatDetails(3, 1, "I don't have any stocks."))
            add(ChatDetails(3, 1, "I'm sorry, man"))
            add(ChatDetails(1, 3, "I'll just look for another supplier. \nThanks anyway."))
            add(ChatDetails(3, 1, "Anytime"))
        }
    }

}
