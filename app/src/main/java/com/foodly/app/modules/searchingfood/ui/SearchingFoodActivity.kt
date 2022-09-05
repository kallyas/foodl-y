package com.foodly.app.modules.searchingfood.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySearchingFoodBinding
import com.foodly.app.modules.searchingfood.`data`.viewmodel.SearchingFoodVM
import kotlin.String
import kotlin.Unit

class SearchingFoodActivity :
    BaseActivity<ActivitySearchingFoodBinding>(R.layout.activity_searching_food) {
  private val viewModel: SearchingFoodVM by viewModels<SearchingFoodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchingFoodVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCHING_FOOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchingFoodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
