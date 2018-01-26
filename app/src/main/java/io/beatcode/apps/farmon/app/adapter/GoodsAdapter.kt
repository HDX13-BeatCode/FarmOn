package io.beatcode.apps.farmon.app.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.data.model.Goods
import io.beatcode.apps.farmon.util.inflate
import kotlinx.android.synthetic.main.item_goods.view.*

/**
 * Created by hdx13 on 25/01/18.
 */
class GoodsAdapter(private val itemList: ArrayList<Goods>, private val listener: (Goods) -> Unit) :
        RecyclerView.Adapter<GoodsAdapter.GoodsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = GoodsHolder(parent.inflate(R.layout.item_goods))

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: GoodsHolder, position: Int) = holder.bind(itemList[position], listener)


    class GoodsHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val goods: Goods? = null
        private val view = v

        fun bind(item: Goods, listener: (Goods) -> Unit) = with(itemView) {
            imgGoodsPic.setImageResource(item.pictureId)
            txtGoodsName.text = item.name
            txtGoodsPrice.text = item.price.toString()

            setOnClickListener { listener(item) }
        }
    }
}