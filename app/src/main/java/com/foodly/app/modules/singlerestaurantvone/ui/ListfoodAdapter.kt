package com.foodly.app.modules.singlerestaurantvone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfoodBinding
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfoodRowModel
import kotlin.Int
import kotlin.collections.List

class ListfoodAdapter(
  var list: List<ListfoodRowModel>
) : RecyclerView.Adapter<ListfoodAdapter.RowListfoodVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfoodVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfood,parent,false)
    return RowListfoodVH(view)
  }

  override fun onBindViewHolder(holder: RowListfoodVH, position: Int) {
    val listfoodRowModel = ListfoodRowModel()
    // TODO uncomment following line after integration with data source
    // val listfoodRowModel = list[position]
    holder.binding.listfoodRowModel = listfoodRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfoodRowModel>) {
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
      item: ListfoodRowModel
    ) {
    }
  }

  inner class RowListfoodVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfoodBinding = RowListfoodBinding.bind(itemView)
  }
}
