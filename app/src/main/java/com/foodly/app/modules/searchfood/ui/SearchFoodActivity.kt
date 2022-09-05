package com.foodly.app.modules.searchfood.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySearchFoodBinding
import com.foodly.app.modules.searchfood.`data`.model.Gridbg2RowModel
import com.foodly.app.modules.searchfood.`data`.model.Tabbar10RowModel
import com.foodly.app.modules.searchfood.`data`.viewmodel.SearchFoodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchFoodActivity : BaseActivity<ActivitySearchFoodBinding>(R.layout.activity_search_food) {
  private val viewModel: SearchFoodVM by viewModels<SearchFoodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridbgAdapter = GridbgAdapter(viewModel.gridbgList.value?:mutableListOf())
    binding.recyclerGridbg.adapter = gridbgAdapter
    gridbgAdapter.setOnItemClickListener(
    object : GridbgAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridbg2RowModel) {
        onClickRecyclerGridbg(view, position, item)
      }
    }
    )
    viewModel.gridbgList.observe(this) {
      gridbgAdapter.updateData(it)
    }
    val tabbar2Adapter = Tabbar2Adapter(viewModel.tabbar2List.value?:mutableListOf())
    binding.recyclerTabbar2.adapter = tabbar2Adapter
    tabbar2Adapter.setOnItemClickListener(
    object : Tabbar2Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tabbar10RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(this) {
      tabbar2Adapter.updateData(it)
    }
    binding.searchFoodVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridbg(
    view: View,
    position: Int,
    item: Gridbg2RowModel
  ): Unit {
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar10RowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_FOOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchFoodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
