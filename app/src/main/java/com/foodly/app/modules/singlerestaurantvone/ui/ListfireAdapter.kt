package com.foodly.app.modules.singlerestaurantvone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfireBinding
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfireRowModel
import kotlin.Int
import kotlin.collections.List

class ListfireAdapter(
  var list: List<ListfireRowModel>
) : RecyclerView.Adapter<ListfireAdapter.RowListfireVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfireVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfire,parent,false)
    return RowListfireVH(view)
  }

  override fun onBindViewHolder(holder: RowListfireVH, position: Int) {
    val listfireRowModel = ListfireRowModel()
    // TODO uncomment following line after integration with data source
    // val listfireRowModel = list[position]
    holder.binding.listfireRowModel = listfireRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfireRowModel>) {
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
      item: ListfireRowModel
    ) {
    }
  }

  inner class RowListfireVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfireBinding = RowListfireBinding.bind(itemView)
  }
}
