package com.foodly.app.modules.homepagvieworder.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowTabbar4Binding
import com.foodly.app.modules.homepagvieworder.`data`.model.Tabbar4RowModel
import kotlin.Int
import kotlin.collections.List

class Tabbar2Adapter(
  var list: List<Tabbar4RowModel>
) : RecyclerView.Adapter<Tabbar2Adapter.RowTabbar4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTabbar4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tabbar4,parent,false)
    return RowTabbar4VH(view)
  }

  override fun onBindViewHolder(holder: RowTabbar4VH, position: Int) {
    val tabbar4RowModel = Tabbar4RowModel()
    // TODO uncomment following line after integration with data source
    // val tabbar4RowModel = list[position]
    holder.binding.tabbar4RowModel = tabbar4RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tabbar4RowModel>) {
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
      item: Tabbar4RowModel
    ) {
    }
  }

  inner class RowTabbar4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTabbar4Binding = RowTabbar4Binding.bind(itemView)
  }
}
