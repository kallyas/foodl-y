package com.foodly.app.modules.accountsettings.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowTabbar9Binding
import com.foodly.app.modules.accountsettings.`data`.model.Tabbar9RowModel
import kotlin.Int
import kotlin.collections.List

class Tabbar2Adapter(
  var list: List<Tabbar9RowModel>
) : RecyclerView.Adapter<Tabbar2Adapter.RowTabbar9VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTabbar9VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tabbar9,parent,false)
    return RowTabbar9VH(view)
  }

  override fun onBindViewHolder(holder: RowTabbar9VH, position: Int) {
    val tabbar9RowModel = Tabbar9RowModel()
    // TODO uncomment following line after integration with data source
    // val tabbar9RowModel = list[position]
    holder.binding.tabbar9RowModel = tabbar9RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tabbar9RowModel>) {
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
      item: Tabbar9RowModel
    ) {
    }
  }

  inner class RowTabbar9VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTabbar9Binding = RowTabbar9Binding.bind(itemView)
  }
}
