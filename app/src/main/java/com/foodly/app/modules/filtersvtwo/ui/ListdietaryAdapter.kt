package com.foodly.app.modules.filtersvtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListdietaryBinding
import com.foodly.app.modules.filtersvtwo.`data`.model.ListdietaryRowModel
import kotlin.Int
import kotlin.collections.List

class ListdietaryAdapter(
  var list: List<ListdietaryRowModel>
) : RecyclerView.Adapter<ListdietaryAdapter.RowListdietaryVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListdietaryVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listdietary,parent,false)
    return RowListdietaryVH(view)
  }

  override fun onBindViewHolder(holder: RowListdietaryVH, position: Int) {
    val listdietaryRowModel = ListdietaryRowModel()
    // TODO uncomment following line after integration with data source
    // val listdietaryRowModel = list[position]
    holder.binding.listdietaryRowModel = listdietaryRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListdietaryRowModel>) {
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
      item: ListdietaryRowModel
    ) {
    }
  }

  inner class RowListdietaryVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListdietaryBinding = RowListdietaryBinding.bind(itemView)
    init {
      binding.btnGlutenfree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListdietaryRowModel())
      }
    }
  }
}
