package com.foodly.app.modules.sharelinkpopup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityShareLinkPopupBinding
import com.foodly.app.modules.sharelinkpopup.`data`.viewmodel.ShareLinkPopupVM
import kotlin.String
import kotlin.Unit

class ShareLinkPopupActivity :
    BaseActivity<ActivityShareLinkPopupBinding>(R.layout.activity_share_link_popup) {
  private val viewModel: ShareLinkPopupVM by viewModels<ShareLinkPopupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.shareLinkPopupVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SHARE_LINK_POPUP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShareLinkPopupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
