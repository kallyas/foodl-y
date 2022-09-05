package com.foodly.app.modules.searchrestaurants.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowGridcookiesandwichBinding
import com.foodly.app.modules.searchrestaurants.`data`.model.GridcookiesandwichRowModel
import kotlin.Int
import kotlin.collections.List

class GridcookiesandwichAdapter(
  var list: List<GridcookiesandwichRowModel>
) : RecyclerView.Adapter<GridcookiesandwichAdapter.RowGridcookiesandwichVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridcookiesandwichVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridcookiesandwich,parent,false)
    return RowGridcookiesandwichVH(view)
  }

  override fun onBindViewHolder(holder: RowGridcookiesandwichVH, position: Int) {
    val gridcookiesandwichRowModel = GridcookiesandwichRowModel()
    // TODO uncomment following line after integration with data source
    // val gridcookiesandwichRowModel = list[position]
    holder.binding.gridcookiesandwichRowModel = gridcookiesandwichRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridcookiesandwichRowModel>) {
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
      item: GridcookiesandwichRowModel
    ) {
    }
  }

  inner class RowGridcookiesandwichVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridcookiesandwichBinding = RowGridcookiesandwichBinding.bind(itemView)
  }
}
