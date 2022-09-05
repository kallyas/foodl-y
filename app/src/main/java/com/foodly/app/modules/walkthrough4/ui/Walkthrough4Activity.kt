package com.foodly.app.modules.walkthrough4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityWalkthrough4Binding
import com.foodly.app.modules.walkthrough4.`data`.model.ImageSliderSliderallyourfavoriModel
import com.foodly.app.modules.walkthrough4.`data`.viewmodel.Walkthrough4VM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class Walkthrough4Activity :
    BaseActivity<ActivityWalkthrough4Binding>(R.layout.activity_walkthrough4) {
  private val imageSliderSliderallyourfavoriItems: ArrayList<ImageSliderSliderallyourfavoriModel> =
      arrayListOf()


  private val viewModel: Walkthrough4VM by viewModels<Walkthrough4VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderallyourfavoriAdapter =
    SliderallyourfavoriAdapter(imageSliderSliderallyourfavoriItems,true)
    binding.imageSliderSliderallyourfavori.adapter = sliderallyourfavoriAdapter
    binding.imageSliderSliderallyourfavori.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorIndicator.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicator.updateIndicatorCounts(binding.imageSliderSliderallyourfavori.indicatorCount)
    binding.walkthrough4VM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderallyourfavori.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderallyourfavori.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WALKTHROUGH4ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Walkthrough4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
