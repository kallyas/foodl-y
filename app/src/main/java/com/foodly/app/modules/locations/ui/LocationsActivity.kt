package com.foodly.app.modules.locations.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityLocationsBinding
import com.foodly.app.modules.locations.`data`.viewmodel.LocationsVM
import kotlin.String
import kotlin.Unit

class LocationsActivity : BaseActivity<ActivityLocationsBinding>(R.layout.activity_locations) {
  private val viewModel: LocationsVM by viewModels<LocationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOCATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LocationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
