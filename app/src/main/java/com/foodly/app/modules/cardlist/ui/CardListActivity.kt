package com.foodly.app.modules.cardlist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityCardListBinding
import com.foodly.app.modules.cardlist.`data`.viewmodel.CardListVM
import kotlin.String
import kotlin.Unit

class CardListActivity : BaseActivity<ActivityCardListBinding>(R.layout.activity_card_list) {
  private val viewModel: CardListVM by viewModels<CardListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cardListVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CARD_LIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CardListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
