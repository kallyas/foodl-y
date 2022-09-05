package com.foodly.app.modules.homepagevthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListbgThreeBinding
import com.foodly.app.modules.homepagevthree.`data`.model.ListbgThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListbgThreeAdapter(
  var list: List<ListbgThreeRowModel>
) : RecyclerView.Adapter<ListbgThreeAdapter.RowListbgThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbgThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbg_three,parent,false)
    return RowListbgThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListbgThreeVH, position: Int) {
    val listbgThreeRowModel = ListbgThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listbgThreeRowModel = list[position]
    holder.binding.listbgThreeRowModel = listbgThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbgThreeRowModel>) {
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
      item: ListbgThreeRowModel
    ) {
    }
  }

  inner class RowListbgThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbgThreeBinding = RowListbgThreeBinding.bind(itemView)
  }
}
