package com.foodly.app.modules.searchfood.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowTabbar10Binding
import com.foodly.app.modules.searchfood.`data`.model.Tabbar10RowModel
import kotlin.Int
import kotlin.collections.List

class Tabbar2Adapter(
  var list: List<Tabbar10RowModel>
) : RecyclerView.Adapter<Tabbar2Adapter.RowTabbar10VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTabbar10VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tabbar10,parent,false)
    return RowTabbar10VH(view)
  }

  override fun onBindViewHolder(holder: RowTabbar10VH, position: Int) {
    val tabbar10RowModel = Tabbar10RowModel()
    // TODO uncomment following line after integration with data source
    // val tabbar10RowModel = list[position]
    holder.binding.tabbar10RowModel = tabbar10RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tabbar10RowModel>) {
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
      item: Tabbar10RowModel
    ) {
    }
  }

  inner class RowTabbar10VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTabbar10Binding = RowTabbar10Binding.bind(itemView)
  }
}
