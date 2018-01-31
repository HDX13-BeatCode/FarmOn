package io.beatcode.apps.farmon.util

import android.net.Uri
import io.beatcode.apps.farmon.data.model.Chats

/**
 * Created by hdx13 on 31/01/18.
 * Interfaces
 * On C#, you have to add a suffix 'I' to interfaces
 */
interface OnListFragmentInteractionListener {
    // TODO: Update argument type and name
    fun onListFragmentInteraction(item: Chats)
}

interface OnFragmentInteractionListener {
    // TODO: Update argument type and name
    fun onFragmentInteraction(uri: Uri)
}