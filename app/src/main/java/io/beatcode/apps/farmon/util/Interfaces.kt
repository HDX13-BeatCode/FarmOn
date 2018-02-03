package io.beatcode.apps.farmon.util

import android.net.Uri
import io.beatcode.apps.farmon.data.model.ChatDetails
import io.beatcode.apps.farmon.data.model.Chats

/**
 * Created by hdx13 on 31/01/18.
 * Interfaces to make life easier
 */
interface OnListFragmentInteractionListener {
    fun <T> onListFragmentInteraction(item: T)
}

interface OnFragmentInteractionListener {
    fun onFragmentInteraction(uri: Uri)
}

