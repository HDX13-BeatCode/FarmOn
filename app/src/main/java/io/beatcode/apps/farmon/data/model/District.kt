package io.beatcode.apps.farmon.data.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by hdx13 on 18/01/18.
 */
open class District(
        var name: String = ""
): RealmObject() {
}