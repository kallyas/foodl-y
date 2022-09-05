package com.foodly.app.modules.singlerestaurantvtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListbg2Binding
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listbg2RowModel
import kotlin.Int
import kotlin.collections.List

class ListbgAdapter(
  var list: List<Listbg2RowModel>
) : RecyclerView.Adapter<ListbgAdapter.RowListbg2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbg2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbg2,parent,false)
    return RowListbg2VH(view)
  }

  override fun onBindViewHolder(holder: RowListbg2VH, position: Int) {
    val listbg2RowModel = Listbg2RowModel()
    // TODO uncomment following line after integration with data source
    // val listbg2RowModel = list[position]
    holder.binding.listbg2RowModel = listbg2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbg2RowModel>) {
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
      item: Listbg2RowModel
    ) {
    }
  }

  inner class RowListbg2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbg2Binding = RowListbg2Binding.bind(itemView)
  }
}
