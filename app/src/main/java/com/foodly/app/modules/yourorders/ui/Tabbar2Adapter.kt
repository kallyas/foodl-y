package com.foodly.app.modules.yourorders.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowTabbar5Binding
import com.foodly.app.modules.yourorders.`data`.model.Tabbar5RowModel
import kotlin.Int
import kotlin.collections.List

class Tabbar2Adapter(
  var list: List<Tabbar5RowModel>
) : RecyclerView.Adapter<Tabbar2Adapter.RowTabbar5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTabbar5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tabbar5,parent,false)
    return RowTabbar5VH(view)
  }

  override fun onBindViewHolder(holder: RowTabbar5VH, position: Int) {
    val tabbar5RowModel = Tabbar5RowModel()
    // TODO uncomment following line after integration with data source
    // val tabbar5RowModel = list[position]
    holder.binding.tabbar5RowModel = tabbar5RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tabbar5RowModel>) {
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
      item: Tabbar5RowModel
    ) {
    }
  }

  inner class RowTabbar5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTabbar5Binding = RowTabbar5Binding.bind(itemView)
  }
}
