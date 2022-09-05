package com.foodly.app.modules.homepagevone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListbgTwoBinding
import com.foodly.app.modules.homepagevone.`data`.model.ListbgTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListbgTwoAdapter(
  var list: List<ListbgTwoRowModel>
) : RecyclerView.Adapter<ListbgTwoAdapter.RowListbgTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbgTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbg_two,parent,false)
    return RowListbgTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListbgTwoVH, position: Int) {
    val listbgTwoRowModel = ListbgTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listbgTwoRowModel = list[position]
    holder.binding.listbgTwoRowModel = listbgTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbgTwoRowModel>) {
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
      item: ListbgTwoRowModel
    ) {
    }
  }

  inner class RowListbgTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbgTwoBinding = RowListbgTwoBinding.bind(itemView)
    init {
      binding.btn45Two.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListbgTwoRowModel())
      }
    }
  }
}
