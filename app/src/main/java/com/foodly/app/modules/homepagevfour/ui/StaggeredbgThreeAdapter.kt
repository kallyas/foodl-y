package com.foodly.app.modules.homepagevfour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowStaggeredbgThreeBinding
import com.foodly.app.modules.homepagevfour.`data`.model.StaggeredbgThreeRowModel
import kotlin.Int
import kotlin.collections.List

class StaggeredbgThreeAdapter(
  var list: List<StaggeredbgThreeRowModel>
) : RecyclerView.Adapter<StaggeredbgThreeAdapter.RowStaggeredbgThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStaggeredbgThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_staggeredbg_three,parent,false)
    return RowStaggeredbgThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowStaggeredbgThreeVH, position: Int) {
    val staggeredbgThreeRowModel = StaggeredbgThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val staggeredbgThreeRowModel = list[position]
    holder.binding.staggeredbgThreeRowModel = staggeredbgThreeRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StaggeredbgThreeRowModel>) {
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
      item: StaggeredbgThreeRowModel
    ) {
    }
  }

  inner class RowStaggeredbgThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStaggeredbgThreeBinding = RowStaggeredbgThreeBinding.bind(itemView)
    init {
      binding.linearTime.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, StaggeredbgThreeRowModel())
      }
      binding.btn45.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, StaggeredbgThreeRowModel())
      }
    }
  }
}
