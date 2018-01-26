package io.beatcode.apps.farmon.app.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import io.beatcode.apps.farmon.R
import io.beatcode.apps.farmon.data.model.Category
import io.beatcode.apps.farmon.util.inflate
import kotlinx.android.synthetic.main.item_category.view.*

/**
 * Created by hdx13 on 25/01/18.
 */
class CategoriesAdapter(private val itemList: ArrayList<Category>, val listener: (Category) -> Unit)
    : RecyclerView.Adapter<CategoriesAdapter.CategoryHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesAdapter.CategoryHolder = CategoryHolder(parent.inflate(R.layout.item_category, false))

    override fun getItemCount(): Int = itemList.size


    override fun onBindViewHolder(holder: CategoriesAdapter.CategoryHolder, position: Int) {
        holder.bind(itemList[position], listener)
    }

    class CategoryHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view: View = v
        private var category: Category? = null

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            Log.d(this::class.java.simpleName, "Clicked")
        }

        companion object {
            private val CATEGORY_KEY = "CATEGORY"
        }

        fun bind(item: Category, listener: (Category) -> Unit) = with(itemView) {
            imgCategoryIcon.setImageResource(item.iconId)
            txtCategoryName.text = item.name
            setOnClickListener { listener(item) }
        }

    }

}