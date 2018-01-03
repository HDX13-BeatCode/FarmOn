package io.beatcode.apps.farmon.util

import android.content.Context


/**
 * Created by hdx13 on 03/01/18.
 */
class SettingsManager {
    companion object {
        operator fun set(context: Context, pname: String, str: String) {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            val editor = sharedPref.edit()
            editor.putString(pname, str)
            editor.apply()
        }

        operator fun set(context: Context, pname: String, str: Boolean) {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            val editor = sharedPref.edit()
            editor.putBoolean(pname, str)
            editor.apply()
        }


        fun getString(context: Context, pname: String): String {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            return sharedPref.getString(pname, "")
        }

        fun getBoolean(context: Context, pname: String): Boolean {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            return sharedPref.getBoolean(pname, false)
        }

        fun clear(context: Context) {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            val editor = sharedPref.edit()
            editor.clear()
            editor.apply()
        }
    }


}