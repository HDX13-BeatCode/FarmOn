package io.beatcode.apps.farmon.app.activity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.data.model.Chats
import io.beatcode.apps.farmon.util.OnListFragmentInteractionListener

import kotlinx.android.synthetic.main.activity_chat_details.*

class ChatDetailsActivity : AppCompatActivity(), OnListFragmentInteractionListener {
    override fun <T> onListFragmentInteraction(item: T) {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_details)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

}
