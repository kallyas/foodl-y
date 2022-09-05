package com.foodly.app.modules.singlerestaurants.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySingleRestaurantsBinding
import com.foodly.app.modules.singlerestaurants.`data`.viewmodel.SingleRestaurantsVM
import kotlin.String
import kotlin.Unit

class SingleRestaurantsActivity :
    BaseActivity<ActivitySingleRestaurantsBinding>(R.layout.activity_single_restaurants) {
  private val viewModel: SingleRestaurantsVM by viewModels<SingleRestaurantsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.singleRestaurantsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SINGLE_RESTAURANTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SingleRestaurantsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
