package io.beatcode.apps.farmon.app.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.R.drawable.img_jeruk
import io.beatcode.apps.farmon.R.drawable.img_kubis
import io.beatcode.apps.farmon.app.adapter.GoodsAdapter
import io.beatcode.apps.farmon.data.model.Goods
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.support.v4.toast

/**
 * Created by hdx13 on 24/01/18.
 * Main menu fragment
 */
class MainFragment : Fragment() {

    private var itemList: ArrayList<Goods> = ArrayList()

    init {
        /** add "Kubis Gunung" */
        itemList.add(Goods(
                0, "Kubis Gunung", 20000, "kg", img_kubis,
                "Segar, baru panen sehari"
        ))

        /** add "Jeruk Mandarin Segar" */
        itemList.add(Goods(
                1, "Jeruk Mandarin Segar", 12000, "ons", img_jeruk,
                "Manis, segar, enak untuk acara besar"
        ))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(R.layout.content_main, container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainMenu.layoutManager = LinearLayoutManager(this.context)

        mainMenu.adapter = GoodsAdapter(itemList) {
            toast("${it.name} selected")
        }
    }
}