package com.foodly.app.modules.signinvone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySignInVoneBinding
import com.foodly.app.modules.signinvone.`data`.viewmodel.SignInVoneVM
import kotlin.String
import kotlin.Unit

class SignInVoneActivity : BaseActivity<ActivitySignInVoneBinding>(R.layout.activity_sign_in_vone) {
  private val viewModel: SignInVoneVM by viewModels<SignInVoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_IN_VONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInVoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
