package com.foodly.app.modules.searchresultsvtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowSearchresultBinding
import com.foodly.app.modules.searchresultsvtwo.`data`.model.SearchresultRowModel
import kotlin.Int
import kotlin.collections.List

class SearchresultAdapter(
  var list: List<SearchresultRowModel>
) : RecyclerView.Adapter<SearchresultAdapter.RowSearchresultVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearchresultVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_searchresult,parent,false)
    return RowSearchresultVH(view)
  }

  override fun onBindViewHolder(holder: RowSearchresultVH, position: Int) {
    val searchresultRowModel = SearchresultRowModel()
    // TODO uncomment following line after integration with data source
    // val searchresultRowModel = list[position]
    holder.binding.searchresultRowModel = searchresultRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SearchresultRowModel>) {
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
      item: SearchresultRowModel
    ) {
    }
  }

  inner class RowSearchresultVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSearchresultBinding = RowSearchresultBinding.bind(itemView)
    init {
      binding.linearTime.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, SearchresultRowModel())
      }
      binding.btn45.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, SearchresultRowModel())
      }
    }
  }
}
