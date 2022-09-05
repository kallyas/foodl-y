package com.foodly.app.modules.searchrestaurants.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowListcookiesandwichThreeBinding
import com.foodly.app.modules.searchrestaurants.`data`.model.ListcookiesandwichThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListcookiesandwichThreeAdapter(
  var list: List<ListcookiesandwichThreeRowModel>
) : RecyclerView.Adapter<ListcookiesandwichThreeAdapter.RowListcookiesandwichThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcookiesandwichThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcookiesandwich_three,parent,false)
    return RowListcookiesandwichThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListcookiesandwichThreeVH, position: Int) {
    val listcookiesandwichThreeRowModel = ListcookiesandwichThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listcookiesandwichThreeRowModel = list[position]
    holder.binding.listcookiesandwichThreeRowModel = listcookiesandwichThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcookiesandwichThreeRowModel>) {
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
      item: ListcookiesandwichThreeRowModel
    ) {
    }
  }

  inner class RowListcookiesandwichThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcookiesandwichThreeBinding =
        RowListcookiesandwichThreeBinding.bind(itemView)
  }
}
