package io.beatcode.apps.farmon.data.model

import io.realm.RealmObject
import io.realm.annotations.Index
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.*

/**
 * Created by hdx13 on 18/01/18.
 * Class for Farmer data
 */

@RealmClass
open class Farmer(
        @PrimaryKey var id: Long = 0,
        @Index var username: String = "",
        var name: String = "",
        var email: String = "",
        var address: String = "",
        var region: Region? = null,
        var district: District? = null,
        var phoneNumber: String = "",
        var whatsAppNumber: String = "",
        var bbmPin: String = "",
        var joinedDate: Date = Date(System.currentTimeMillis())
): RealmObject()