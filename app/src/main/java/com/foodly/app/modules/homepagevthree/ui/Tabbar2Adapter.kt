package com.foodly.app.modules.homepagevthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowTabbar6Binding
import com.foodly.app.modules.homepagevthree.`data`.model.Tabbar6RowModel
import kotlin.Int
import kotlin.collections.List

class Tabbar2Adapter(
  var list: List<Tabbar6RowModel>
) : RecyclerView.Adapter<Tabbar2Adapter.RowTabbar6VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTabbar6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tabbar6,parent,false)
    return RowTabbar6VH(view)
  }

  override fun onBindViewHolder(holder: RowTabbar6VH, position: Int) {
    val tabbar6RowModel = Tabbar6RowModel()
    // TODO uncomment following line after integration with data source
    // val tabbar6RowModel = list[position]
    holder.binding.tabbar6RowModel = tabbar6RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tabbar6RowModel>) {
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
      item: Tabbar6RowModel
    ) {
    }
  }

  inner class RowTabbar6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTabbar6Binding = RowTabbar6Binding.bind(itemView)
  }
}
