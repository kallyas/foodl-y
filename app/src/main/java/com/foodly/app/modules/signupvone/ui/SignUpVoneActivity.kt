package com.foodly.app.modules.signupvone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySignUpVoneBinding
import com.foodly.app.modules.signupvone.`data`.viewmodel.SignUpVoneVM
import kotlin.String
import kotlin.Unit

class SignUpVoneActivity : BaseActivity<ActivitySignUpVoneBinding>(R.layout.activity_sign_up_vone) {
  private val viewModel: SignUpVoneVM by viewModels<SignUpVoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_VONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpVoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
