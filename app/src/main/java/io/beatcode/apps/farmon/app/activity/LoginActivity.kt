package io.beatcode.apps.farmon.app.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.data.LOGGED_IN
import io.beatcode.apps.farmon.data.USER_NAME
import io.beatcode.apps.farmon.util.SettingsManager
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.indeterminateProgressDialog
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener { login(edtUser.text.toString(), edtPass.text.toString()) }
        btnSignUp.setOnClickListener { toast("Coming soon!") }
    }

    private fun login(user: String, pass: String) {
        // checks if the inputs are empty
        if (user.isEmpty() or pass.isEmpty()) {
            toast(R.string.login_empty)
            return // and stop login procedure
        }

        val prgLoading = indeterminateProgressDialog(R.string.logging_in)
        prgLoading.show()

        // TODO Add oAuth system here
        val success = (user == "Linus") and (pass == "123456")
        //

        prgLoading.dismiss()

        if (success) {
            SettingsManager.set(applicationContext, LOGGED_IN, true)
            SettingsManager.set(applicationContext, USER_NAME, "Linus")
            startActivity<MainActivity>()
            finish()
        } else toast(R.string.login_wrong)
    }
}
