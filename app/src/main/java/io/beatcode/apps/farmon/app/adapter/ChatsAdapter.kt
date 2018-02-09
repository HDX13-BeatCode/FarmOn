package io.beatcode.apps.farmon.app.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.data.DummyContent
import io.beatcode.apps.farmon.data.model.Chats
import io.beatcode.apps.farmon.util.OnListFragmentInteractionListener
import io.beatcode.apps.farmon.util.inflate

/**
 * [RecyclerView.Adapter] that can display a [Chats] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class ChatsAdapter(
        private val items: List<Chats> = DummyContent.chatItems,
        var action: OnListFragmentInteractionListener? = null)
    : RecyclerView.Adapter<ChatsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
        = ViewHolder(parent.inflate(R.layout.item_chats))


    override fun onBindViewHolder(holder: ViewHolder, position: Int)
        = holder.bind(items[position])

    override fun getItemCount(): Int {
        return items.size
    }

    fun setListener(action: OnListFragmentInteractionListener){
        this.action = action
    }

    inner class ViewHolder(private val mView: View) : RecyclerView.ViewHolder(mView) {

        var userTxt: TextView = itemView.findViewById(R.id.txtChatUser)
        var descTxt: TextView = itemView.findViewById(R.id.txtChatLastContent)

        fun bind(item: Chats) = with(mView) {
            userTxt.text = item.user2Id.toString()
            descTxt.text = item.chatDetails[item.chatDetails.lastIndex].content

            setOnClickListener{
                action?.onListFragmentInteraction(item)
            }
        }


    }
}
