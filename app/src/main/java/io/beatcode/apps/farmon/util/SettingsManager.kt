package io.beatcode.apps.farmon.util

import android.content.Context


/**
 * Created by hdx13 on 03/01/18.
 */
object SettingsManager {

        fun setValue(context: Context, pname: String, str: String) {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            val editor = sharedPref.edit()
            editor.putString(pname, str)
            editor.apply()
        }

        fun setValue(context: Context, pname: String, bool: Boolean) {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            val editor = sharedPref.edit()
            editor.putBoolean(pname, bool)
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

        /*
         * ClearAll acts to remove all settings from the app.
         * Use with caution!
         */
        fun clearAll(context: Context) {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            val editor = sharedPref.edit()
            editor.clear()
            editor.apply()
        }

        fun remove(context: Context, pname: String) {
            val sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(context)
            val editor = sharedPref.edit()
            editor.remove(pname)
            editor.apply()
        }

}