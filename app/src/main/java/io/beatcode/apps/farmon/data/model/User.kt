package io.beatcode.apps.farmon.data.model

import io.realm.RealmObject
import io.realm.annotations.Index
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.*
import java.time.LocalDateTime

/**
 * Created by hdx13 on 18/01/18.
 */

@RealmClass
open class User(
        @PrimaryKey var id: Long = 0,
        @Index var username: String = "",
        var name: String = "",
        var email: String = "",
        var address: String = "",
        var region: Region? = null,
        var district: District? = null,
        var phoneNumber: String = "",
        var joinedTime: LocalDateTime = LocalDateTime.now()
): RealmObject()