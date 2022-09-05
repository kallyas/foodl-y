package com.foodly.app.modules.featuredpartnersvtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityFeaturedPartnersVtwoBinding
import com.foodly.app.modules.featuredpartnersvtwo.`data`.model.Gridbg1RowModel
import com.foodly.app.modules.featuredpartnersvtwo.`data`.model.Tabbar7RowModel
import com.foodly.app.modules.featuredpartnersvtwo.`data`.viewmodel.FeaturedPartnersVtwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FeaturedPartnersVtwoActivity :
    BaseActivity<ActivityFeaturedPartnersVtwoBinding>(R.layout.activity_featured_partners_vtwo) {
  private val viewModel: FeaturedPartnersVtwoVM by viewModels<FeaturedPartnersVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridbgAdapter = GridbgAdapter(viewModel.gridbgList.value?:mutableListOf())
    binding.recyclerGridbg.adapter = gridbgAdapter
    gridbgAdapter.setOnItemClickListener(
    object : GridbgAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridbg1RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Tabbar7RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(this) {
      tabbar2Adapter.updateData(it)
    }
    binding.featuredPartnersVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridbg(
    view: View,
    position: Int,
    item: Gridbg1RowModel
  ): Unit {
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar7RowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "FEATURED_PARTNERS_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FeaturedPartnersVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
