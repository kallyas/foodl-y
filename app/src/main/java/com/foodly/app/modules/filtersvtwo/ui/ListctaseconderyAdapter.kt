package com.foodly.app.modules.filtersvtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListctaseconderyBinding
import com.foodly.app.modules.filtersvtwo.`data`.model.ListctaseconderyRowModel
import kotlin.Int
import kotlin.collections.List

class ListctaseconderyAdapter(
  var list: List<ListctaseconderyRowModel>
) : RecyclerView.Adapter<ListctaseconderyAdapter.RowListctaseconderyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListctaseconderyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listctasecondery,parent,false)
    return RowListctaseconderyVH(view)
  }

  override fun onBindViewHolder(holder: RowListctaseconderyVH, position: Int) {
    val listctaseconderyRowModel = ListctaseconderyRowModel()
    // TODO uncomment following line after integration with data source
    // val listctaseconderyRowModel = list[position]
    holder.binding.listctaseconderyRowModel = listctaseconderyRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListctaseconderyRowModel>) {
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
      item: ListctaseconderyRowModel
    ) {
    }
  }

  inner class RowListctaseconderyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListctaseconderyBinding = RowListctaseconderyBinding.bind(itemView)
  }
}
