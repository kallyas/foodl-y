package com.foodly.app.modules.addtoorder.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityAddToOrderBinding
import com.foodly.app.modules.addtoorder.`data`.viewmodel.AddToOrderVM
import kotlin.String
import kotlin.Unit

class AddToOrderActivity : BaseActivity<ActivityAddToOrderBinding>(R.layout.activity_add_to_order) {
  private val viewModel: AddToOrderVM by viewModels<AddToOrderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addToOrderVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_TO_ORDER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddToOrderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
