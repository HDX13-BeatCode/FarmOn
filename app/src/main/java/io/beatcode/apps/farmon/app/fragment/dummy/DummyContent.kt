package io.beatcode.apps.farmon.app.fragment.dummy

import io.beatcode.apps.farmon.data.model.ChatContent
import io.beatcode.apps.farmon.data.model.Chats
import java.util.ArrayList
import java.util.HashMap

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
    val ITEMS: MutableList<Chats> = ArrayList()

    init {
        ITEMS.add(Chats(0, 1, 2))

        with(ITEMS[0].chatContents) {
            add(ChatContent(1, 2, "How many is the bananas?"))
            add(ChatContent(2, 1, "About 20 kg"))

        }

        ITEMS.add(Chats(1, 1, 3))

        with(ITEMS[1].chatContents) {
            add(ChatContent(3, 1, "I don't have any stocks."))
            add(ChatContent(3, 1, "I'm sorry, man"))
            add(ChatContent(1, 3, "I'll just look for another. \nThanks anyway."))

        }
    }

}
