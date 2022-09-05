package com.foodly.app.modules.addsocialaccounts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityAddSocialAccountsBinding
import com.foodly.app.modules.addsocialaccounts.`data`.viewmodel.AddSocialAccountsVM
import kotlin.String
import kotlin.Unit

class AddSocialAccountsActivity :
    BaseActivity<ActivityAddSocialAccountsBinding>(R.layout.activity_add_social_accounts) {
  private val viewModel: AddSocialAccountsVM by viewModels<AddSocialAccountsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addSocialAccountsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_SOCIAL_ACCOUNTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddSocialAccountsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
