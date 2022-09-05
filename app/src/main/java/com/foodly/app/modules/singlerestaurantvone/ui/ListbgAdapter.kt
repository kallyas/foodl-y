package com.foodly.app.modules.singlerestaurantvone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListbgBinding
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListbgRowModel
import kotlin.Int
import kotlin.collections.List

class ListbgAdapter(
  var list: List<ListbgRowModel>
) : RecyclerView.Adapter<ListbgAdapter.RowListbgVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbgVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbg,parent,false)
    return RowListbgVH(view)
  }

  override fun onBindViewHolder(holder: RowListbgVH, position: Int) {
    val listbgRowModel = ListbgRowModel()
    // TODO uncomment following line after integration with data source
    // val listbgRowModel = list[position]
    holder.binding.listbgRowModel = listbgRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbgRowModel>) {
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
      item: ListbgRowModel
    ) {
    }
  }

  inner class RowListbgVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbgBinding = RowListbgBinding.bind(itemView)
  }
}
