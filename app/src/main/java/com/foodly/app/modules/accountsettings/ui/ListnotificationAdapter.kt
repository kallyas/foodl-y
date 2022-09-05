package com.foodly.app.modules.accountsettings.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListnotificationBinding
import com.foodly.app.modules.accountsettings.`data`.model.ListnotificationRowModel
import kotlin.Int
import kotlin.collections.List

class ListnotificationAdapter(
  var list: List<ListnotificationRowModel>
) : RecyclerView.Adapter<ListnotificationAdapter.RowListnotificationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnotificationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnotification,parent,false)
    return RowListnotificationVH(view)
  }

  override fun onBindViewHolder(holder: RowListnotificationVH, position: Int) {
    val listnotificationRowModel = ListnotificationRowModel()
    // TODO uncomment following line after integration with data source
    // val listnotificationRowModel = list[position]
    holder.binding.listnotificationRowModel = listnotificationRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnotificationRowModel>) {
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
      item: ListnotificationRowModel
    ) {
    }
  }

  inner class RowListnotificationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnotificationBinding = RowListnotificationBinding.bind(itemView)
  }
}
