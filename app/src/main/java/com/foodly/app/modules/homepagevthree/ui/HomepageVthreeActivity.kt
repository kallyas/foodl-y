package com.foodly.app.modules.homepagevthree.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityHomepageVthreeBinding
import com.foodly.app.modules.homepagevthree.`data`.model.ImageSliderSliderbgModel
import com.foodly.app.modules.homepagevthree.`data`.model.ImageSliderSliderbgOneModel
import com.foodly.app.modules.homepagevthree.`data`.model.ImageSliderSliderbgTwoModel
import com.foodly.app.modules.homepagevthree.`data`.model.ListbgThreeRowModel
import com.foodly.app.modules.homepagevthree.`data`.model.SpinnerDeliveryaddresModel
import com.foodly.app.modules.homepagevthree.`data`.model.Tabbar6RowModel
import com.foodly.app.modules.homepagevthree.`data`.viewmodel.HomepageVthreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomepageVthreeActivity :
    BaseActivity<ActivityHomepageVthreeBinding>(R.layout.activity_homepage_vthree) {
  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_185x335")


  private val imageSliderSliderbgItems: ArrayList<ImageSliderSliderbgModel> =
      arrayListOf(ImageSliderSliderbgModel(imageBG =
  imageUri.toString()),ImageSliderSliderbgModel(imageBG = imageUri.toString()))


  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_7")


  private val imageSliderSliderbgOneItems: ArrayList<ImageSliderSliderbgOneModel> =
      arrayListOf(ImageSliderSliderbgOneModel(imageBGOne =
  imageUri.toString()),ImageSliderSliderbgOneModel(imageBGOne = imageUri.toString()))


  private val imageUri: Uri =
      Uri.parse("android.resource://com.foodly.app/drawable/img_headerimage")


  private val imageSliderSliderbgTwoItems: ArrayList<ImageSliderSliderbgTwoModel> =
      arrayListOf(ImageSliderSliderbgTwoModel(imageBGTwo =
  imageUri.toString()),ImageSliderSliderbgTwoModel(imageBGTwo = imageUri.toString()))


  private val viewModel: HomepageVthreeVM by viewModels<HomepageVthreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerDeliveryaddresList.value = mutableListOf(
    SpinnerDeliveryaddresModel("Item1"),
    SpinnerDeliveryaddresModel("Item2"),
    SpinnerDeliveryaddresModel("Item3"),
    SpinnerDeliveryaddresModel("Item4"),
    SpinnerDeliveryaddresModel("Item5")
    )
    val spinnerDeliveryaddresAdapter =
    SpinnerDeliveryaddresAdapter(this,R.layout.spinner_item,viewModel.spinnerDeliveryaddresList.value?:
    mutableListOf())
    binding.spinnerDeliveryaddres.adapter = spinnerDeliveryaddresAdapter
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
    val listbgThreeAdapter =
    ListbgThreeAdapter(viewModel.listbgThreeList.value?:mutableListOf())
    binding.recyclerListbgThree.adapter = listbgThreeAdapter
    listbgThreeAdapter.setOnItemClickListener(
    object : ListbgThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbgThreeRowModel) {
        onClickRecyclerListbgThree(view, position, item)
      }
    }
    )
    viewModel.listbgThreeList.observe(this) {
      listbgThreeAdapter.updateData(it)
    }
    val tabbar2Adapter = Tabbar2Adapter(viewModel.tabbar2List.value?:mutableListOf())
    binding.recyclerTabbar2.adapter = tabbar2Adapter
    tabbar2Adapter.setOnItemClickListener(
    object : Tabbar2Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tabbar6RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(this) {
      tabbar2Adapter.updateData(it)
    }
    binding.homepageVthreeVM = viewModel
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

  fun onClickRecyclerListbgThree(
    view: View,
    position: Int,
    item: ListbgThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar6RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_VTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageVthreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
