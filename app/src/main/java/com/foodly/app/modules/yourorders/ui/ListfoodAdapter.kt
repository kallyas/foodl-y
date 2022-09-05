package com.foodly.app.modules.yourorders.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfood1Binding
import com.foodly.app.modules.yourorders.`data`.model.Listfood1RowModel
import kotlin.Int
import kotlin.collections.List

class ListfoodAdapter(
  var list: List<Listfood1RowModel>
) : RecyclerView.Adapter<ListfoodAdapter.RowListfood1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfood1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfood1,parent,false)
    return RowListfood1VH(view)
  }

  override fun onBindViewHolder(holder: RowListfood1VH, position: Int) {
    val listfood1RowModel = Listfood1RowModel()
    // TODO uncomment following line after integration with data source
    // val listfood1RowModel = list[position]
    holder.binding.listfood1RowModel = listfood1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listfood1RowModel>) {
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
      item: Listfood1RowModel
    ) {
    }
  }

  inner class RowListfood1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfood1Binding = RowListfood1Binding.bind(itemView)
  }
}
