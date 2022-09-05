package com.foodly.app.modules.filtersfoodtypevone1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityFiltersFoodTypeVone1Binding
import com.foodly.app.modules.filtersfoodtypevone1.`data`.viewmodel.FiltersFoodTypeVone1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class FiltersFoodTypeVone1Activity :
    BaseActivity<ActivityFiltersFoodTypeVone1Binding>(R.layout.activity_filters_food_type_vone1) {
  private val viewModel: FiltersFoodTypeVone1VM by viewModels<FiltersFoodTypeVone1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filtersFoodTypeVone1VM = viewModel
    val adapter = FiltersFoodTypeVone1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutMenu,binding.viewPagerViewpager) { tab, position ->
      tab.text = FiltersFoodTypeVone1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "FILTERS_FOOD_TYPE_VONE1ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FiltersFoodTypeVone1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
