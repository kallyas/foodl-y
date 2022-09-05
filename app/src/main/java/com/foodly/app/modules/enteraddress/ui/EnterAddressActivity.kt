package com.foodly.app.modules.enteraddress.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityEnterAddressBinding
import com.foodly.app.modules.enteraddress.`data`.viewmodel.EnterAddressVM
import kotlin.String
import kotlin.Unit

class EnterAddressActivity :
    BaseActivity<ActivityEnterAddressBinding>(R.layout.activity_enter_address) {
  private val viewModel: EnterAddressVM by viewModels<EnterAddressVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enterAddressVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ENTER_ADDRESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EnterAddressActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
