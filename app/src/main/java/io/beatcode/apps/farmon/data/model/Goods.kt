package io.beatcode.apps.farmon.data.model

/**
 * Created by hdx13 on 18/01/18.
 * Class for Goods data
 */

//@RealmClass
//open class Goods(
//        @PrimaryKey var id: Long = 0,
//        var name: String = "",
//        var price: Long = 0,
//        var userId: Long = 0,
//        var regionId: Int = 0,
//        var districtId: Int = 0,
//        var description: String = "",
//        var createdTime: Date = Date(System.currentTimeMillis())
//) : RealmObject()

data class Goods(
        val id: Long = 0,
        var name: String = "",
        var price: Long = 0,
        var unit: String = "kg",
        var pictureId: Int = 0,
        var description: String = ""
)