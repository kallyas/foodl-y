package com.foodly.app.modules.singlerestaurantvtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfire1Binding
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listfire1RowModel
import kotlin.Int
import kotlin.collections.List

class ListfireAdapter(
  var list: List<Listfire1RowModel>
) : RecyclerView.Adapter<ListfireAdapter.RowListfire1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfire1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfire1,parent,false)
    return RowListfire1VH(view)
  }

  override fun onBindViewHolder(holder: RowListfire1VH, position: Int) {
    val listfire1RowModel = Listfire1RowModel()
    // TODO uncomment following line after integration with data source
    // val listfire1RowModel = list[position]
    holder.binding.listfire1RowModel = listfire1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listfire1RowModel>) {
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
      item: Listfire1RowModel
    ) {
    }
  }

  inner class RowListfire1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfire1Binding = RowListfire1Binding.bind(itemView)
  }
}
