package com.foodly.app.modules.filtersvtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityFiltersVtwoBinding
import com.foodly.app.modules.filtersvtwo.`data`.model.ListctaseconderyRowModel
import com.foodly.app.modules.filtersvtwo.`data`.model.ListdietaryRowModel
import com.foodly.app.modules.filtersvtwo.`data`.viewmodel.FiltersVtwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FiltersVtwoActivity : BaseActivity<ActivityFiltersVtwoBinding>(R.layout.activity_filters_vtwo)
    {
  private val viewModel: FiltersVtwoVM by viewModels<FiltersVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listctaseconderyAdapter =
    ListctaseconderyAdapter(viewModel.listctaseconderyList.value?:mutableListOf())
    binding.recyclerListctasecondery.adapter = listctaseconderyAdapter
    listctaseconderyAdapter.setOnItemClickListener(
    object : ListctaseconderyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListctaseconderyRowModel) {
        onClickRecyclerListctasecondery(view, position, item)
      }
    }
    )
    viewModel.listctaseconderyList.observe(this) {
      listctaseconderyAdapter.updateData(it)
    }
    val listdietaryAdapter =
    ListdietaryAdapter(viewModel.listdietaryList.value?:mutableListOf())
    binding.recyclerListdietary.adapter = listdietaryAdapter
    listdietaryAdapter.setOnItemClickListener(
    object : ListdietaryAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListdietaryRowModel) {
        onClickRecyclerListdietary(view, position, item)
      }
    }
    )
    viewModel.listdietaryList.observe(this) {
      listdietaryAdapter.updateData(it)
    }
    binding.filtersVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListctasecondery(
    view: View,
    position: Int,
    item: ListctaseconderyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListdietary(
    view: View,
    position: Int,
    item: ListdietaryRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FILTERS_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FiltersVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
