package com.foodly.app.modules.loginbyphonenumber.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityLoginByPhoneNumberBinding
import com.foodly.app.modules.loginbyphonenumber.`data`.viewmodel.LoginByPhoneNumberVM
import kotlin.String
import kotlin.Unit

class LoginByPhoneNumberActivity :
    BaseActivity<ActivityLoginByPhoneNumberBinding>(R.layout.activity_login_by_phone_number) {
  private val viewModel: LoginByPhoneNumberVM by viewModels<LoginByPhoneNumberVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginByPhoneNumberVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOGIN_BY_PHONE_NUMBER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginByPhoneNumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
