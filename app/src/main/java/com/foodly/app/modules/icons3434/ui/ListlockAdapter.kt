package com.foodly.app.modules.icons3434.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListlockBinding
import com.foodly.app.modules.icons3434.`data`.model.ListlockRowModel
import kotlin.Int
import kotlin.collections.List

class ListlockAdapter(
  var list: List<ListlockRowModel>
) : RecyclerView.Adapter<ListlockAdapter.RowListlockVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlockVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlock,parent,false)
    return RowListlockVH(view)
  }

  override fun onBindViewHolder(holder: RowListlockVH, position: Int) {
    val listlockRowModel = ListlockRowModel()
    // TODO uncomment following line after integration with data source
    // val listlockRowModel = list[position]
    holder.binding.listlockRowModel = listlockRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlockRowModel>) {
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
      item: ListlockRowModel
    ) {
    }
  }

  inner class RowListlockVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlockBinding = RowListlockBinding.bind(itemView)
    init {
      binding.imageFacebook.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListlockRowModel())
      }
      binding.imageFolder.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListlockRowModel())
      }
    }
  }
}
