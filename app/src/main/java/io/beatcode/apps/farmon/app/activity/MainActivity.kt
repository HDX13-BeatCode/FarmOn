package io.beatcode.apps.farmon.app.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.data.LOGGED_IN
import io.beatcode.apps.farmon.data.USER_NAME
import io.beatcode.apps.farmon.util.SettingsManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtHello.text = "Welcome, ${SettingsManager.getString(applicationContext, USER_NAME)}"

        btnLogout.setOnClickListener {
            SettingsManager.remove(applicationContext, LOGGED_IN)
            SettingsManager.remove(applicationContext, USER_NAME)
            startActivity<LoginActivity>()
            finish()
        }
    }
}
