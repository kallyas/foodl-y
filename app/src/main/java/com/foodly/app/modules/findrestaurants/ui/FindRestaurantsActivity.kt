package com.foodly.app.modules.findrestaurants.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityFindRestaurantsBinding
import com.foodly.app.modules.findrestaurants.`data`.model.GridbgRowModel
import com.foodly.app.modules.findrestaurants.`data`.viewmodel.FindRestaurantsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FindRestaurantsActivity :
    BaseActivity<ActivityFindRestaurantsBinding>(R.layout.activity_find_restaurants) {
  private val viewModel: FindRestaurantsVM by viewModels<FindRestaurantsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridbgAdapter = GridbgAdapter(viewModel.gridbgList.value?:mutableListOf())
    binding.recyclerGridbg.adapter = gridbgAdapter
    gridbgAdapter.setOnItemClickListener(
    object : GridbgAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridbgRowModel) {
        onClickRecyclerGridbg(view, position, item)
      }
    }
    )
    viewModel.gridbgList.observe(this) {
      gridbgAdapter.updateData(it)
    }
    binding.findRestaurantsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridbg(
    view: View,
    position: Int,
    item: GridbgRowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "FIND_RESTAURANTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FindRestaurantsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
