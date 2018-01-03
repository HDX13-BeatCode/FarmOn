package io.beatcode.apps.farmon.app

import android.app.Application
import android.util.Log
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

/**
 * Created by hdx13 on 03/01/18.
 */

class AppController : Application() {

    private var reqQ: RequestQueue? = null
        get() {
            if (reqQ == null) reqQ = Volley.newRequestQueue(applicationContext)
            return reqQ
        }

    override fun onCreate() {
        super.onCreate()
        // Until we have locale function, this remains dead
        // Locale.setDefault(Locale("in", "ID"))
    }

    public fun <T> addReqQ(req: Request<T>) {
        req.tag = TAG

        // gotta trap it on try block
        // just in case if the reqQ is null
        try {
            this.reqQ!!.add(req)
        } catch (npe: NullPointerException) {
            // gotcha!
            Log.e(TAG, "Request queue is gone", npe)
        } catch (e: Exception) {
            // other problems
            Log.e(TAG, "An error occurred", e)
        }

    }

    companion object {
        const val TAG: String = "FarmOn"
        internal val instance = AppController()
    }
}
