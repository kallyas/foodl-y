package com.foodly.app.modules.homepagevone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowTabbar3Binding
import com.foodly.app.modules.homepagevone.`data`.model.Tabbar3RowModel
import kotlin.Int
import kotlin.collections.List

class Tabbar2Adapter(
  var list: List<Tabbar3RowModel>
) : RecyclerView.Adapter<Tabbar2Adapter.RowTabbar3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTabbar3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tabbar3,parent,false)
    return RowTabbar3VH(view)
  }

  override fun onBindViewHolder(holder: RowTabbar3VH, position: Int) {
    val tabbar3RowModel = Tabbar3RowModel()
    // TODO uncomment following line after integration with data source
    // val tabbar3RowModel = list[position]
    holder.binding.tabbar3RowModel = tabbar3RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tabbar3RowModel>) {
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
      item: Tabbar3RowModel
    ) {
    }
  }

  inner class RowTabbar3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTabbar3Binding = RowTabbar3Binding.bind(itemView)
  }
}
