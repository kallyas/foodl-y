package com.foodly.app.modules.searchresultsvtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySearchResultsVtwoBinding
import com.foodly.app.modules.searchresultsvtwo.`data`.model.SearchresultRowModel
import com.foodly.app.modules.searchresultsvtwo.`data`.viewmodel.SearchResultsVtwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResultsVtwoActivity :
    BaseActivity<ActivitySearchResultsVtwoBinding>(R.layout.activity_search_results_vtwo) {
  private val viewModel: SearchResultsVtwoVM by viewModels<SearchResultsVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val searchresultAdapter =
    SearchresultAdapter(viewModel.searchresultList.value?:mutableListOf())
    binding.recyclerSearchresult.adapter = searchresultAdapter
    searchresultAdapter.setOnItemClickListener(
    object : SearchresultAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SearchresultRowModel) {
        onClickRecyclerSearchresult(view, position, item)
      }
    }
    )
    viewModel.searchresultList.observe(this) {
      searchresultAdapter.updateData(it)
    }
    binding.searchResultsVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSearchresult(
    view: View,
    position: Int,
    item: SearchresultRowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_RESULTS_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchResultsVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
