package io.beatcode.apps.farmon.app

import android.app.Application
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import io.beatcode.apps.farmon.data.REALM_NAME
import io.realm.Realm
import io.realm.RealmConfiguration



/**
 * Created by hdx13 on 03/01/18.
 * This is where all the magic of the app itself comes from
 * Basically a singleton
 */

class AppController : Application() {

    private var reqQ: RequestQueue? = null

    public val requestQueue: RequestQueue
        get() {
            if (reqQ == null) reqQ = Volley.newRequestQueue(applicationContext)
            return reqQ!!
        }

    override fun onCreate() {
        super.onCreate()

        // preparing Realm
        Realm.init(this)
        val realmCfg = RealmConfiguration.Builder()
                .name(REALM_NAME)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build()
        Realm.setDefaultConfiguration(realmCfg)

        // Until we have locale function, this remains dead
        // Locale.setDefault(Locale("in", "ID"))
    }

    public fun <T> addRequestQueue(req: Request<T>) {
        req.tag = TAG
        requestQueue.add(req)
    }

    init {
        me = this
    }

    companion object {
        const val TAG: String = "FarmOn"

        private var me: AppController? = null

        public val instance: AppController
            get() = me!!
    }
}
