package com.foodly.app.modules.singlerestaurantvone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfoodThreeBinding
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfoodThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListfoodThreeAdapter(
  var list: List<ListfoodThreeRowModel>
) : RecyclerView.Adapter<ListfoodThreeAdapter.RowListfoodThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfoodThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfood_three,parent,false)
    return RowListfoodThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListfoodThreeVH, position: Int) {
    val listfoodThreeRowModel = ListfoodThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listfoodThreeRowModel = list[position]
    holder.binding.listfoodThreeRowModel = listfoodThreeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfoodThreeRowModel>) {
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
      item: ListfoodThreeRowModel
    ) {
    }
  }

  inner class RowListfoodThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfoodThreeBinding = RowListfoodThreeBinding.bind(itemView)
  }
}
