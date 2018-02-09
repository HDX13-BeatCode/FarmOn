package io.beatcode.apps.farmon.app.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.data.model.ChatDetails
import io.beatcode.apps.farmon.util.OnListFragmentInteractionListener
import io.beatcode.apps.farmon.util.inflate

/**
 * [RecyclerView.Adapter] that can display a [List] of [ChatDetails] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class ChatDetailsAdapter(
        private val mValues: List<ChatDetails>,
        private val mListener: OnListFragmentInteractionListener? = null
) : RecyclerView.Adapter<ChatDetailsAdapter.ViewHolder>() {

    public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
        = ViewHolder(parent.inflate(R.layout.item_chat_details))


    public override fun onBindViewHolder(holder: ViewHolder, position: Int)
        = holder.bind(mValues[position])

    public override fun getItemCount(): Int
        = mValues.size


    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: TextView = mView.findViewById(R.id.txtChatDetailsUser) as TextView
        val mContentView: TextView = mView.findViewById(R.id.txtChatDetailsContent) as TextView
        var mItem: ChatDetails = ChatDetails(-1, -1, "null")

        fun bind(item: ChatDetails = mItem) = with(this){
            mIdView.text = item.senderId.toString()
            mContentView.text = item.content

            mView.setOnClickListener {
                mListener?.onListFragmentInteraction(item)
            }
        }

    }
}
