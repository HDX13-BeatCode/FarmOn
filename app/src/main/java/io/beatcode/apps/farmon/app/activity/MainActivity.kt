package io.beatcode.apps.farmon.app.activity

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.app.adapter.MainPagerAdapter
import io.beatcode.apps.farmon.app.fragment.ChatsFragment
import io.beatcode.apps.farmon.app.fragment.MainFragment
import io.beatcode.apps.farmon.data.model.Chats
import io.beatcode.apps.farmon.util.OnFragmentInteractionListener
import io.beatcode.apps.farmon.util.OnListFragmentInteractionListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener,
        OnFragmentInteractionListener, OnListFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {

    }

    override fun onListFragmentInteraction(item: Chats) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // preparing the app bars
        setSupportActionBar(toolBar)

        // getting ready for the pages
        val pagerAdapter = MainPagerAdapter(
                supportFragmentManager,
                resources.getString(R.string.tab_main),
                resources.getString(R.string.tab_chat)
        )
        pager.adapter = pagerAdapter

        // activating tabs
        tabLayout.setupWithViewPager(pager)

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }

        val toggle = ActionBarDrawerToggle(
                this, mainDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        mainDrawer.addDrawerListener(toggle)


        navView.setNavigationItemSelectedListener(this)


        // syncs everything
        syncLoginState()
        toggle.syncState()

    }

    override fun onResume() {
        super.onResume(); syncLoginState()
    }

    private fun syncLoginState() {
//        txtUsername.text = SettingsManager.getString(applicationContext, USER_NAME)
//        txtUserEmail.text = SettingsManager.getString(applicationContext, USER_EMAIL)
    }

    override fun onBackPressed() {
        if (mainDrawer.isDrawerOpen(GravityCompat.START)) {
            mainDrawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        mainDrawer.closeDrawer(GravityCompat.START)
        return true
    }
}
