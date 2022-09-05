package com.foodly.app.modules.icons2424.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfolderBinding
import com.foodly.app.modules.icons2424.`data`.model.ListfolderRowModel
import kotlin.Int
import kotlin.collections.List

class ListfolderAdapter(
  var list: List<ListfolderRowModel>
) : RecyclerView.Adapter<ListfolderAdapter.RowListfolderVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfolderVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfolder,parent,false)
    return RowListfolderVH(view)
  }

  override fun onBindViewHolder(holder: RowListfolderVH, position: Int) {
    val listfolderRowModel = ListfolderRowModel()
    // TODO uncomment following line after integration with data source
    // val listfolderRowModel = list[position]
    holder.binding.listfolderRowModel = listfolderRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfolderRowModel>) {
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
      item: ListfolderRowModel
    ) {
    }
  }

  inner class RowListfolderVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfolderBinding = RowListfolderBinding.bind(itemView)
    init {
      binding.imageFolder.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListfolderRowModel())
      }
    }
  }
}
