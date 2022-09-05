package com.foodly.app.modules.confirmphonenumber.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityConfirmPhoneNumberBinding
import com.foodly.app.modules.confirmphonenumber.`data`.viewmodel.ConfirmPhoneNumberVM
import kotlin.String
import kotlin.Unit

class ConfirmPhoneNumberActivity :
    BaseActivity<ActivityConfirmPhoneNumberBinding>(R.layout.activity_confirm_phone_number) {
  private val viewModel: ConfirmPhoneNumberVM by viewModels<ConfirmPhoneNumberVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.confirmPhoneNumberVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONFIRM_PHONE_NUMBER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConfirmPhoneNumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
