package com.foodly.app.modules.searchrestaurants.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySearchRestaurantsBinding
import com.foodly.app.modules.searchrestaurants.`data`.model.GridcookiesandwichRowModel
import com.foodly.app.modules.searchrestaurants.`data`.model.ListcookiesandwichThreeRowModel
import com.foodly.app.modules.searchrestaurants.`data`.model.Tabbar8RowModel
import com.foodly.app.modules.searchrestaurants.`data`.viewmodel.SearchRestaurantsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchRestaurantsActivity :
    BaseActivity<ActivitySearchRestaurantsBinding>(R.layout.activity_search_restaurants) {
  private val viewModel: SearchRestaurantsVM by viewModels<SearchRestaurantsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridcookiesandwichAdapter =
    GridcookiesandwichAdapter(viewModel.gridcookiesandwichList.value?:mutableListOf())
    binding.recyclerGridcookiesandwich.adapter = gridcookiesandwichAdapter
    gridcookiesandwichAdapter.setOnItemClickListener(
    object : GridcookiesandwichAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridcookiesandwichRowModel) {
        onClickRecyclerGridcookiesandwich(view, position, item)
      }
    }
    )
    viewModel.gridcookiesandwichList.observe(this) {
      gridcookiesandwichAdapter.updateData(it)
    }
    val listcookiesandwichThreeAdapter =
    ListcookiesandwichThreeAdapter(viewModel.listcookiesandwichThreeList.value?:mutableListOf())
    binding.recyclerListcookiesandwichThree.adapter = listcookiesandwichThreeAdapter
    listcookiesandwichThreeAdapter.setOnItemClickListener(
    object : ListcookiesandwichThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListcookiesandwichThreeRowModel) {
        onClickRecyclerListcookiesandwichThree(view, position, item)
      }
    }
    )
    viewModel.listcookiesandwichThreeList.observe(this) {
      listcookiesandwichThreeAdapter.updateData(it)
    }
    val tabbar2Adapter = Tabbar2Adapter(viewModel.tabbar2List.value?:mutableListOf())
    binding.recyclerTabbar2.adapter = tabbar2Adapter
    tabbar2Adapter.setOnItemClickListener(
    object : Tabbar2Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tabbar8RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(this) {
      tabbar2Adapter.updateData(it)
    }
    binding.searchRestaurantsVM = viewModel
    setUpSearchViewSearchformListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridcookiesandwich(
    view: View,
    position: Int,
    item: GridcookiesandwichRowModel
  ): Unit {
  }

  fun onClickRecyclerListcookiesandwichThree(
    view: View,
    position: Int,
    item: ListcookiesandwichThreeRowModel
  ): Unit {
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar8RowModel
  ): Unit {
  }

  private fun setUpSearchViewSearchformListener(): Unit {
    binding.searchViewSearchform.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_RESTAURANTS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchRestaurantsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
