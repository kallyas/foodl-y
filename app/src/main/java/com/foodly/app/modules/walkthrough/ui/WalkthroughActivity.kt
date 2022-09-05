package com.foodly.app.modules.walkthrough.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityWalkthroughBinding
import com.foodly.app.modules.walkthrough.`data`.model.ImageSliderSliderfreedeliveryoModel
import com.foodly.app.modules.walkthrough.`data`.viewmodel.WalkthroughVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class WalkthroughActivity : BaseActivity<ActivityWalkthroughBinding>(R.layout.activity_walkthrough)
    {
  private val imageSliderSliderfreedeliveryoItems: ArrayList<ImageSliderSliderfreedeliveryoModel> =
      arrayListOf()


  private val viewModel: WalkthroughVM by viewModels<WalkthroughVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderfreedeliveryoAdapter =
    SliderfreedeliveryoAdapter(imageSliderSliderfreedeliveryoItems,true)
    binding.imageSliderSliderfreedeliveryo.adapter = sliderfreedeliveryoAdapter
    binding.imageSliderSliderfreedeliveryo.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorIndicator.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicator.updateIndicatorCounts(binding.imageSliderSliderfreedeliveryo.indicatorCount)
    binding.walkthroughVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderfreedeliveryo.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderfreedeliveryo.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WALKTHROUGH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WalkthroughActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
