package com.foodly.app.modules.walkthrough2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityWalkthrough2Binding
import com.foodly.app.modules.walkthrough2.`data`.model.ImageSliderSliderchooseyourfooModel
import com.foodly.app.modules.walkthrough2.`data`.viewmodel.Walkthrough2VM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class Walkthrough2Activity :
    BaseActivity<ActivityWalkthrough2Binding>(R.layout.activity_walkthrough2) {
  private val imageSliderSliderchooseyourfooItems: ArrayList<ImageSliderSliderchooseyourfooModel> =
      arrayListOf()


  private val viewModel: Walkthrough2VM by viewModels<Walkthrough2VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderchooseyourfooAdapter =
    SliderchooseyourfooAdapter(imageSliderSliderchooseyourfooItems,true)
    binding.imageSliderSliderchooseyourfoo.adapter = sliderchooseyourfooAdapter
    binding.imageSliderSliderchooseyourfoo.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorIndicator.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicator.updateIndicatorCounts(binding.imageSliderSliderchooseyourfoo.indicatorCount)
    binding.walkthrough2VM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderchooseyourfoo.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderchooseyourfoo.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WALKTHROUGH2ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Walkthrough2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
