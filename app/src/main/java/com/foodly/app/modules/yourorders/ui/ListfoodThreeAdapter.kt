package com.foodly.app.modules.yourorders.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfoodThree1Binding
import com.foodly.app.modules.yourorders.`data`.model.ListfoodThree1RowModel
import kotlin.Int
import kotlin.collections.List

class ListfoodThreeAdapter(
  var list: List<ListfoodThree1RowModel>
) : RecyclerView.Adapter<ListfoodThreeAdapter.RowListfoodThree1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfoodThree1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfood_three1,parent,false)
    return RowListfoodThree1VH(view)
  }

  override fun onBindViewHolder(holder: RowListfoodThree1VH, position: Int) {
    val listfoodThree1RowModel = ListfoodThree1RowModel()
    // TODO uncomment following line after integration with data source
    // val listfoodThree1RowModel = list[position]
    holder.binding.listfoodThree1RowModel = listfoodThree1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfoodThree1RowModel>) {
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
      item: ListfoodThree1RowModel
    ) {
    }
  }

  inner class RowListfoodThree1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfoodThree1Binding = RowListfoodThree1Binding.bind(itemView)
  }
}
