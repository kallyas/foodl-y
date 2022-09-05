package com.foodly.app.modules.signinvtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySignInVtwoBinding
import com.foodly.app.modules.signinvtwo.`data`.viewmodel.SignInVtwoVM
import kotlin.String
import kotlin.Unit

class SignInVtwoActivity : BaseActivity<ActivitySignInVtwoBinding>(R.layout.activity_sign_in_vtwo) {
  private val viewModel: SignInVtwoVM by viewModels<SignInVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_IN_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
