package io.beatcode.apps.farmon.app.activity

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.data.LOGGED_IN
import io.beatcode.apps.farmon.util.SettingsManager
import org.jetbrains.anko.alert


class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA, Manifest.permission.CALL_PHONE), 1)
        else proceed()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.size == 4) proceed()
        else kill()
    }

    private fun proceed() {
        Handler().postDelayed({
            if (SettingsManager.getBoolean(applicationContext, LOGGED_IN)) {
                // if logged in, load MainActivity
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            } else {
                // if not, send to LoginActivity
                startActivity(Intent(applicationContext, LoginActivity::class.java))
                finish()
            }
        }, 1000)
    }

    private fun kill() {
        alert(R.string.permission_required, R.string.permission_required_title) {
            finish()
        }.show()
    }
}
