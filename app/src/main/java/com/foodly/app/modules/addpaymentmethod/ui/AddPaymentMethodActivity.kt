package com.foodly.app.modules.addpaymentmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityAddPaymentMethodBinding
import com.foodly.app.modules.addpaymentmethod.`data`.viewmodel.AddPaymentMethodVM
import kotlin.String
import kotlin.Unit

class AddPaymentMethodActivity :
    BaseActivity<ActivityAddPaymentMethodBinding>(R.layout.activity_add_payment_method) {
  private val viewModel: AddPaymentMethodVM by viewModels<AddPaymentMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addPaymentMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_PAYMENT_METHOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddPaymentMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
