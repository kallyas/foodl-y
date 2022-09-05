package com.foodly.app.modules.homepagevtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityHomepageVtwoBinding
import com.foodly.app.modules.homepagevtwo.`data`.model.AllRowModel
import com.foodly.app.modules.homepagevtwo.`data`.model.SpinnerDeliveryaddresModel
import com.foodly.app.modules.homepagevtwo.`data`.viewmodel.HomepageVtwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageVtwoActivity :
    BaseActivity<ActivityHomepageVtwoBinding>(R.layout.activity_homepage_vtwo) {
  private val viewModel: HomepageVtwoVM by viewModels<HomepageVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerDeliveryaddresList.value = mutableListOf(
    SpinnerDeliveryaddresModel("Item1"),
    SpinnerDeliveryaddresModel("Item2"),
    SpinnerDeliveryaddresModel("Item3"),
    SpinnerDeliveryaddresModel("Item4"),
    SpinnerDeliveryaddresModel("Item5")
    )
    val spinnerDeliveryaddresAdapter =
    SpinnerDeliveryaddresAdapter(this,R.layout.spinner_item,viewModel.spinnerDeliveryaddresList.value?:
    mutableListOf())
    binding.spinnerDeliveryaddres.adapter = spinnerDeliveryaddresAdapter
    val allAdapter = AllAdapter(viewModel.allList.value?:mutableListOf())
    binding.recyclerAll.adapter = allAdapter
    allAdapter.setOnItemClickListener(
    object : AllAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AllRowModel) {
        onClickRecyclerAll(view, position, item)
      }
    }
    )
    viewModel.allList.observe(this) {
      allAdapter.updateData(it)
    }
    binding.homepageVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerAll(
    view: View,
    position: Int,
    item: AllRowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGE_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
