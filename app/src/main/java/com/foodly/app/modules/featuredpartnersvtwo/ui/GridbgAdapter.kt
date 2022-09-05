package com.foodly.app.modules.featuredpartnersvtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowGridbg1Binding
import com.foodly.app.modules.featuredpartnersvtwo.`data`.model.Gridbg1RowModel
import kotlin.Int
import kotlin.collections.List

class GridbgAdapter(
  var list: List<Gridbg1RowModel>
) : RecyclerView.Adapter<GridbgAdapter.RowGridbg1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridbg1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridbg1,parent,false)
    return RowGridbg1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridbg1VH, position: Int) {
    val gridbg1RowModel = Gridbg1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridbg1RowModel = list[position]
    holder.binding.gridbg1RowModel = gridbg1RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridbg1RowModel>) {
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
      item: Gridbg1RowModel
    ) {
    }
  }

  inner class RowGridbg1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridbg1Binding = RowGridbg1Binding.bind(itemView)
    init {
      binding.linearTime.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Gridbg1RowModel())
      }
      binding.btn45.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Gridbg1RowModel())
      }
    }
  }
}
