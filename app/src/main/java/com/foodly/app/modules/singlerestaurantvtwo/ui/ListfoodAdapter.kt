package com.foodly.app.modules.singlerestaurantvtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListfood2Binding
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listfood2RowModel
import kotlin.Int
import kotlin.collections.List

class ListfoodAdapter(
  var list: List<Listfood2RowModel>
) : RecyclerView.Adapter<ListfoodAdapter.RowListfood2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfood2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfood2,parent,false)
    return RowListfood2VH(view)
  }

  override fun onBindViewHolder(holder: RowListfood2VH, position: Int) {
    val listfood2RowModel = Listfood2RowModel()
    // TODO uncomment following line after integration with data source
    // val listfood2RowModel = list[position]
    holder.binding.listfood2RowModel = listfood2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listfood2RowModel>) {
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
      item: Listfood2RowModel
    ) {
    }
  }

  inner class RowListfood2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfood2Binding = RowListfood2Binding.bind(itemView)
  }
}
