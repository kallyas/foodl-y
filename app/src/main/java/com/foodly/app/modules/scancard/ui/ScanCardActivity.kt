package com.foodly.app.modules.scancard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityScanCardBinding
import com.foodly.app.modules.scancard.`data`.viewmodel.ScanCardVM
import kotlin.String
import kotlin.Unit

class ScanCardActivity : BaseActivity<ActivityScanCardBinding>(R.layout.activity_scan_card) {
  private val viewModel: ScanCardVM by viewModels<ScanCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCAN_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
