package com.foodly.app.modules.orderdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListoneBinding
import com.foodly.app.modules.orderdetails.`data`.model.ListoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListoneAdapter(
  var list: List<ListoneRowModel>
) : RecyclerView.Adapter<ListoneAdapter.RowListoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListoneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listone,parent,false)
    return RowListoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListoneVH, position: Int) {
    val listoneRowModel = ListoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listoneRowModel = list[position]
    holder.binding.listoneRowModel = listoneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListoneRowModel>) {
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
      item: ListoneRowModel
    ) {
    }
  }

  inner class RowListoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListoneBinding = RowListoneBinding.bind(itemView)
    init {
      binding.btnOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListoneRowModel())
      }
    }
  }
}
