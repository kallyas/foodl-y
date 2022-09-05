package com.foodly.app.modules.homepagevone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListbg1Binding
import com.foodly.app.modules.homepagevone.`data`.model.Listbg1RowModel
import kotlin.Int
import kotlin.collections.List

class ListbgAdapter(
  var list: List<Listbg1RowModel>
) : RecyclerView.Adapter<ListbgAdapter.RowListbg1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbg1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbg1,parent,false)
    return RowListbg1VH(view)
  }

  override fun onBindViewHolder(holder: RowListbg1VH, position: Int) {
    val listbg1RowModel = Listbg1RowModel()
    // TODO uncomment following line after integration with data source
    // val listbg1RowModel = list[position]
    holder.binding.listbg1RowModel = listbg1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbg1RowModel>) {
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
      item: Listbg1RowModel
    ) {
    }
  }

  inner class RowListbg1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbg1Binding = RowListbg1Binding.bind(itemView)
    init {
      binding.btn45.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listbg1RowModel())
      }
    }
  }
}
