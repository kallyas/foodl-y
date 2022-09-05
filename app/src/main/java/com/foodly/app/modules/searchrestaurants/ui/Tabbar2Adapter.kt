package com.foodly.app.modules.searchrestaurants.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowTabbar8Binding
import com.foodly.app.modules.searchrestaurants.`data`.model.Tabbar8RowModel
import kotlin.Int
import kotlin.collections.List

class Tabbar2Adapter(
  var list: List<Tabbar8RowModel>
) : RecyclerView.Adapter<Tabbar2Adapter.RowTabbar8VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTabbar8VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tabbar8,parent,false)
    return RowTabbar8VH(view)
  }

  override fun onBindViewHolder(holder: RowTabbar8VH, position: Int) {
    val tabbar8RowModel = Tabbar8RowModel()
    // TODO uncomment following line after integration with data source
    // val tabbar8RowModel = list[position]
    holder.binding.tabbar8RowModel = tabbar8RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tabbar8RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Tabbar8RowModel
    ) {
    }
  }

  inner class RowTabbar8VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTabbar8Binding = RowTabbar8Binding.bind(itemView)
  }
}
