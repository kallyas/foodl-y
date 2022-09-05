package com.foodly.app.modules.searchfood.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowGridbg2Binding
import com.foodly.app.modules.searchfood.`data`.model.Gridbg2RowModel
import kotlin.Int
import kotlin.collections.List

class GridbgAdapter(
  var list: List<Gridbg2RowModel>
) : RecyclerView.Adapter<GridbgAdapter.RowGridbg2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridbg2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridbg2,parent,false)
    return RowGridbg2VH(view)
  }

  override fun onBindViewHolder(holder: RowGridbg2VH, position: Int) {
    val gridbg2RowModel = Gridbg2RowModel()
    // TODO uncomment following line after integration with data source
    // val gridbg2RowModel = list[position]
    holder.binding.gridbg2RowModel = gridbg2RowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridbg2RowModel>) {
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
      item: Gridbg2RowModel
    ) {
    }
  }

  inner class RowGridbg2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridbg2Binding = RowGridbg2Binding.bind(itemView)
  }
}
