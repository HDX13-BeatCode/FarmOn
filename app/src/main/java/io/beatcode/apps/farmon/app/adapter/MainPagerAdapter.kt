package io.beatcode.apps.farmon.app.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import io.beatcode.apps.farmon.app.fragment.ChatFragment
import io.beatcode.apps.farmon.app.fragment.MainFragment

/**
 * Created by hdx13 on 24/01/18.
 * Handles the page on the MainActivity
 */
class MainPagerAdapter(fm: FragmentManager, private val page1: String, private val page2: String)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> MainFragment()
            1 -> ChatFragment()
            else -> null
        }
    }

    override fun getCount() = 2

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> page1
            1 -> page2
            else -> null
        }
    }

}