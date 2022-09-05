package com.foodly.app.modules.signupvtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySignUpVtwoBinding
import com.foodly.app.modules.signupvtwo.`data`.viewmodel.SignUpVtwoVM
import kotlin.String
import kotlin.Unit

class SignUpVtwoActivity : BaseActivity<ActivitySignUpVtwoBinding>(R.layout.activity_sign_up_vtwo) {
  private val viewModel: SignUpVtwoVM by viewModels<SignUpVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
