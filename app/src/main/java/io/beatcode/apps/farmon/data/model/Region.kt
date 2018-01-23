package io.beatcode.apps.farmon.data.model

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by hdx13 on 18/01/18.
 * Region object for Realm
 */
open class Region(
        var name: String = "",
        var districts: RealmList<District> = RealmList()
): RealmObject()