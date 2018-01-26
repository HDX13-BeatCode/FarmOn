package io.beatcode.apps.farmon.util

import android.content.Context
import io.beatcode.apps.farmon.data.LOGGED_IN
import io.beatcode.apps.farmon.data.USER_EMAIL
import io.beatcode.apps.farmon.data.USER_NAME
import io.beatcode.apps.farmon.data.model.User

/**
 * Created by hdx13 on 25/01/18.
 */
object UserManager {

    fun login(context: Context, userData: User) {

    }

    fun logout(context: Context, userData: User) {
        SettingsManager.remove(context, USER_EMAIL)
        SettingsManager.remove(context, USER_NAME)
        SettingsManager.setValue(context, LOGGED_IN, false)
    }

    fun register(context: Context, userData: User) {

    }

}