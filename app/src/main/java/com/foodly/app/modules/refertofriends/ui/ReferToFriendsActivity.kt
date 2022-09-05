package com.foodly.app.modules.refertofriends.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityReferToFriendsBinding
import com.foodly.app.modules.refertofriends.`data`.viewmodel.ReferToFriendsVM
import kotlin.String
import kotlin.Unit

class ReferToFriendsActivity :
    BaseActivity<ActivityReferToFriendsBinding>(R.layout.activity_refer_to_friends) {
  private val viewModel: ReferToFriendsVM by viewModels<ReferToFriendsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.referToFriendsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REFER_TO_FRIENDS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReferToFriendsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
