package com.foodly.app.modules.yourorders1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListone1Binding
import com.foodly.app.modules.yourorders1.`data`.model.Listone1RowModel
import kotlin.Int
import kotlin.collections.List

class ListoneAdapter(
  var list: List<Listone1RowModel>
) : RecyclerView.Adapter<ListoneAdapter.RowListone1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListone1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listone1,parent,false)
    return RowListone1VH(view)
  }

  override fun onBindViewHolder(holder: RowListone1VH, position: Int) {
    val listone1RowModel = Listone1RowModel()
    // TODO uncomment following line after integration with data source
    // val listone1RowModel = list[position]
    holder.binding.listone1RowModel = listone1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listone1RowModel>) {
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
      item: Listone1RowModel
    ) {
    }
  }

  inner class RowListone1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListone1Binding = RowListone1Binding.bind(itemView)
    init {
      binding.btnOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listone1RowModel())
      }
    }
  }
}
