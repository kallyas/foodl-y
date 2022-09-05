package com.foodly.app.modules.resetemail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityResetEmailBinding
import com.foodly.app.modules.resetemail.`data`.viewmodel.ResetEmailVM
import kotlin.String
import kotlin.Unit

class ResetEmailActivity : BaseActivity<ActivityResetEmailBinding>(R.layout.activity_reset_email) {
  private val viewModel: ResetEmailVM by viewModels<ResetEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resetEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RESET_EMAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResetEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
