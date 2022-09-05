package com.foodly.app.modules.singlerestaurantvtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfoodThree2Binding
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.ListfoodThree2RowModel
import kotlin.Int
import kotlin.collections.List

class ListfoodThreeAdapter(
  var list: List<ListfoodThree2RowModel>
) : RecyclerView.Adapter<ListfoodThreeAdapter.RowListfoodThree2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfoodThree2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfood_three2,parent,false)
    return RowListfoodThree2VH(view)
  }

  override fun onBindViewHolder(holder: RowListfoodThree2VH, position: Int) {
    val listfoodThree2RowModel = ListfoodThree2RowModel()
    // TODO uncomment following line after integration with data source
    // val listfoodThree2RowModel = list[position]
    holder.binding.listfoodThree2RowModel = listfoodThree2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfoodThree2RowModel>) {
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
      item: ListfoodThree2RowModel
    ) {
    }
  }

  inner class RowListfoodThree2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfoodThree2Binding = RowListfoodThree2Binding.bind(itemView)
  }
}
