package com.foodly.app.modules.findrestaurants.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowGridbgBinding
import com.foodly.app.modules.findrestaurants.`data`.model.GridbgRowModel
import kotlin.Int
import kotlin.collections.List

class GridbgAdapter(
  var list: List<GridbgRowModel>
) : RecyclerView.Adapter<GridbgAdapter.RowGridbgVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridbgVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridbg,parent,false)
    return RowGridbgVH(view)
  }

  override fun onBindViewHolder(holder: RowGridbgVH, position: Int) {
    val gridbgRowModel = GridbgRowModel()
    // TODO uncomment following line after integration with data source
    // val gridbgRowModel = list[position]
    holder.binding.gridbgRowModel = gridbgRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridbgRowModel>) {
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
      item: GridbgRowModel
    ) {
    }
  }

  inner class RowGridbgVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridbgBinding = RowGridbgBinding.bind(itemView)
    init {
      binding.linearTime.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridbgRowModel())
      }
      binding.btn45.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridbgRowModel())
      }
    }
  }
}
