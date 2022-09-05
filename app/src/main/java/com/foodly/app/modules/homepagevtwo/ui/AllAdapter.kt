package com.foodly.app.modules.homepagevtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.foodly.app.R
import com.foodly.app.databinding.RowAllBinding
import com.foodly.app.modules.homepagevtwo.`data`.model.AllRowModel
import kotlin.Int
import kotlin.collections.List

class AllAdapter(
  var list: List<AllRowModel>
) : RecyclerView.Adapter<AllAdapter.RowAllVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAllVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_all,parent,false)
    return RowAllVH(view)
  }

  override fun onBindViewHolder(holder: RowAllVH, position: Int) {
    val allRowModel = AllRowModel()
    // TODO uncomment following line after integration with data source
    // val allRowModel = list[position]
    holder.binding.allRowModel = allRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AllRowModel>) {
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
      item: AllRowModel
    ) {
    }
  }

  inner class RowAllVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAllBinding = RowAllBinding.bind(itemView)
    init {
      binding.linearTime.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, AllRowModel())
      }
      binding.btn45.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, AllRowModel())
      }
    }
  }
}
