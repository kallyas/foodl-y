package com.foodly.app.modules.featuredpartnersvone.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityFeaturedPartnersVoneBinding
import com.foodly.app.modules.featuredpartnersvone.`data`.model.ImageSliderSliderbgModel
import com.foodly.app.modules.featuredpartnersvone.`data`.model.ImageSliderSliderbgOneModel
import com.foodly.app.modules.featuredpartnersvone.`data`.model.ImageSliderSliderbgTwoModel
import com.foodly.app.modules.featuredpartnersvone.`data`.model.Tabbar2RowModel
import com.foodly.app.modules.featuredpartnersvone.`data`.viewmodel.FeaturedPartnersVoneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class FeaturedPartnersVoneActivity :
    BaseActivity<ActivityFeaturedPartnersVoneBinding>(R.layout.activity_featured_partners_vone) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.foodly.app/drawable/img_headerimage")


  private val imageSliderSliderbgItems: ArrayList<ImageSliderSliderbgModel> =
      arrayListOf(ImageSliderSliderbgModel(imageBG =
  imageUri.toString()),ImageSliderSliderbgModel(imageBG = imageUri.toString()))


  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_7")


  private val imageSliderSliderbgOneItems: ArrayList<ImageSliderSliderbgOneModel> =
      arrayListOf(ImageSliderSliderbgOneModel(imageBGOne =
  imageUri.toString()),ImageSliderSliderbgOneModel(imageBGOne = imageUri.toString()))


  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_185x335")


  private val imageSliderSliderbgTwoItems: ArrayList<ImageSliderSliderbgTwoModel> =
      arrayListOf(ImageSliderSliderbgTwoModel(imageBGTwo =
  imageUri.toString()),ImageSliderSliderbgTwoModel(imageBGTwo = imageUri.toString()))


  private val viewModel: FeaturedPartnersVoneVM by viewModels<FeaturedPartnersVoneVM>()

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
    val tabbar2Adapter = Tabbar2Adapter(viewModel.tabbar2List.value?:mutableListOf())
    binding.recyclerTabbar2.adapter = tabbar2Adapter
    tabbar2Adapter.setOnItemClickListener(
    object : Tabbar2Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tabbar2RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(this) {
      tabbar2Adapter.updateData(it)
    }
    binding.featuredPartnersVoneVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderbg.pauseAutoScroll()
    binding.imageSliderSliderbgOne.pauseAutoScroll()
    binding.imageSliderSliderbgTwo.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderbg.resumeAutoScroll()
    binding.imageSliderSliderbgOne.resumeAutoScroll()
    binding.imageSliderSliderbgTwo.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar2RowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "FEATURED_PARTNERS_VONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FeaturedPartnersVoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
