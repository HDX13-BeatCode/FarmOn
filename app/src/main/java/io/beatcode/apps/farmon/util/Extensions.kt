package io.beatcode.apps.farmon.util

import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by hdx13 on 25/01/18.
 */

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

inline fun <T> OnListFragmentInteractionListener.setOnListFragmentInteractionListener(action: (item: T) -> Unit){

}