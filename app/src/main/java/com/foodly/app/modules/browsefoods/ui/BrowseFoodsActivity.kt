package com.foodly.app.modules.browsefoods.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityBrowseFoodsBinding
import com.foodly.app.modules.browsefoods.`data`.model.ImageSliderSliderbgModel
import com.foodly.app.modules.browsefoods.`data`.model.ImageSliderSliderbgOneModel
import com.foodly.app.modules.browsefoods.`data`.model.ImageSliderSliderbgThreeModel
import com.foodly.app.modules.browsefoods.`data`.model.ImageSliderSliderbgTwoModel
import com.foodly.app.modules.browsefoods.`data`.viewmodel.BrowseFoodsVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class BrowseFoodsActivity : BaseActivity<ActivityBrowseFoodsBinding>(R.layout.activity_browse_foods)
    {
  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_12")


  private val imageSliderSliderbgItems: ArrayList<ImageSliderSliderbgModel> =
      arrayListOf(ImageSliderSliderbgModel(imageBG =
  imageUri.toString()),ImageSliderSliderbgModel(imageBG = imageUri.toString()))


  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_13")


  private val imageSliderSliderbgOneItems: ArrayList<ImageSliderSliderbgOneModel> =
      arrayListOf(ImageSliderSliderbgOneModel(imageBGOne =
  imageUri.toString()),ImageSliderSliderbgOneModel(imageBGOne = imageUri.toString()))


  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_14")


  private val imageSliderSliderbgTwoItems: ArrayList<ImageSliderSliderbgTwoModel> =
      arrayListOf(ImageSliderSliderbgTwoModel(imageBGTwo =
  imageUri.toString()),ImageSliderSliderbgTwoModel(imageBGTwo = imageUri.toString()))


  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_15")


  private val imageSliderSliderbgThreeItems: ArrayList<ImageSliderSliderbgThreeModel> =
      arrayListOf(ImageSliderSliderbgThreeModel(imageBGThree =
  imageUri.toString()),ImageSliderSliderbgThreeModel(imageBGThree = imageUri.toString()))


  private val viewModel: BrowseFoodsVM by viewModels<BrowseFoodsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderbgAdapter = SliderbgAdapter(imageSliderSliderbgItems,true)
    binding.imageSliderSliderbg.adapter = sliderbgAdapter
    binding.imageSliderSliderbg.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicator.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicator.updateIndicatorCounts(binding.imageSliderSliderbg.indicatorCount)
    val sliderbgOneAdapter = SliderbgOneAdapter(imageSliderSliderbgOneItems,true)
    binding.imageSliderSliderbgOne.adapter = sliderbgOneAdapter
    binding.imageSliderSliderbgOne.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicatorOne.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicatorOne.updateIndicatorCounts(binding.imageSliderSliderbgOne.indicatorCount)
    val sliderbgTwoAdapter = SliderbgTwoAdapter(imageSliderSliderbgTwoItems,true)
    binding.imageSliderSliderbgTwo.adapter = sliderbgTwoAdapter
    binding.imageSliderSliderbgTwo.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicatorTwo.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicatorTwo.updateIndicatorCounts(binding.imageSliderSliderbgTwo.indicatorCount)
    val sliderbgThreeAdapter = SliderbgThreeAdapter(imageSliderSliderbgThreeItems,true)
    binding.imageSliderSliderbgThree.adapter = sliderbgThreeAdapter
    binding.imageSliderSliderbgThree.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicatorThree.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicatorThree.updateIndicatorCounts(binding.imageSliderSliderbgThree.indicatorCount)
    binding.browseFoodsVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderbg.pauseAutoScroll()
    binding.imageSliderSliderbgOne.pauseAutoScroll()
    binding.imageSliderSliderbgTwo.pauseAutoScroll()
    binding.imageSliderSliderbgThree.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderbg.resumeAutoScroll()
    binding.imageSliderSliderbgOne.resumeAutoScroll()
    binding.imageSliderSliderbgTwo.resumeAutoScroll()
    binding.imageSliderSliderbgThree.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BROWSE_FOODS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BrowseFoodsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
