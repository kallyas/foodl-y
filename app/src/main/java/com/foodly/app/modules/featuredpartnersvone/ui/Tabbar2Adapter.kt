package com.foodly.app.modules.featuredpartnersvone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowTabbar2Binding
import com.foodly.app.modules.featuredpartnersvone.`data`.model.Tabbar2RowModel
import kotlin.Int
import kotlin.collections.List

class Tabbar2Adapter(
  var list: List<Tabbar2RowModel>
) : RecyclerView.Adapter<Tabbar2Adapter.RowTabbar2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTabbar2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tabbar2,parent,false)
    return RowTabbar2VH(view)
  }

  override fun onBindViewHolder(holder: RowTabbar2VH, position: Int) {
    val tabbar2RowModel = Tabbar2RowModel()
    // TODO uncomment following line after integration with data source
    // val tabbar2RowModel = list[position]
    holder.binding.tabbar2RowModel = tabbar2RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Tabbar2RowModel>) {
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
      item: Tabbar2RowModel
    ) {
    }
  }

  inner class RowTabbar2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTabbar2Binding = RowTabbar2Binding.bind(itemView)
  }
}
