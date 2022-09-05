package com.foodly.app.modules.homepagevone.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityHomepageVoneBinding
import com.foodly.app.modules.homepagevone.`data`.model.ImageSliderSliderbgFiveModel
import com.foodly.app.modules.homepagevone.`data`.model.ImageSliderSliderbgFourModel
import com.foodly.app.modules.homepagevone.`data`.model.ImageSliderSliderbgSixModel
import com.foodly.app.modules.homepagevone.`data`.model.ImageSliderSliderbitmapModel
import com.foodly.app.modules.homepagevone.`data`.model.Listbg1RowModel
import com.foodly.app.modules.homepagevone.`data`.model.ListbgTwoRowModel
import com.foodly.app.modules.homepagevone.`data`.model.SpinnerDeliveryaddresModel
import com.foodly.app.modules.homepagevone.`data`.model.Tabbar3RowModel
import com.foodly.app.modules.homepagevone.`data`.viewmodel.HomepageVoneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomepageVoneActivity :
    BaseActivity<ActivityHomepageVoneBinding>(R.layout.activity_homepage_vone) {
  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bitmap")


  private val imageSliderSliderbitmapItems: ArrayList<ImageSliderSliderbitmapModel> =
      arrayListOf(ImageSliderSliderbitmapModel(imageBitmap =
  imageUri.toString()),ImageSliderSliderbitmapModel(imageBitmap = imageUri.toString()))


  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_185x335")


  private val imageSliderSliderbgFourItems: ArrayList<ImageSliderSliderbgFourModel> =
      arrayListOf(ImageSliderSliderbgFourModel(imageBGFour =
  imageUri.toString()),ImageSliderSliderbgFourModel(imageBGFour = imageUri.toString()))


  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_bg_7")


  private val imageSliderSliderbgFiveItems: ArrayList<ImageSliderSliderbgFiveModel> =
      arrayListOf(ImageSliderSliderbgFiveModel(imageBGFive =
  imageUri.toString()),ImageSliderSliderbgFiveModel(imageBGFive = imageUri.toString()))


  private val imageUri: Uri =
      Uri.parse("android.resource://com.foodly.app/drawable/img_headerimage")


  private val imageSliderSliderbgSixItems: ArrayList<ImageSliderSliderbgSixModel> =
      arrayListOf(ImageSliderSliderbgSixModel(imageBGSix =
  imageUri.toString()),ImageSliderSliderbgSixModel(imageBGSix = imageUri.toString()))


  private val viewModel: HomepageVoneVM by viewModels<HomepageVoneVM>()

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
    val sliderbitmapAdapter = SliderbitmapAdapter(imageSliderSliderbitmapItems,true)
    binding.imageSliderSliderbitmap.adapter = sliderbitmapAdapter
    binding.imageSliderSliderbitmap.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicator.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicator.updateIndicatorCounts(binding.imageSliderSliderbitmap.indicatorCount)
    val sliderbgFourAdapter = SliderbgFourAdapter(imageSliderSliderbgFourItems,true)
    binding.imageSliderSliderbgFour.adapter = sliderbgFourAdapter
    binding.imageSliderSliderbgFour.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicatorOne.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicatorOne.updateIndicatorCounts(binding.imageSliderSliderbgFour.indicatorCount)
    val sliderbgFiveAdapter = SliderbgFiveAdapter(imageSliderSliderbgFiveItems,true)
    binding.imageSliderSliderbgFive.adapter = sliderbgFiveAdapter
    binding.imageSliderSliderbgFive.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicatorTwo.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicatorTwo.updateIndicatorCounts(binding.imageSliderSliderbgFive.indicatorCount)
    val sliderbgSixAdapter = SliderbgSixAdapter(imageSliderSliderbgSixItems,true)
    binding.imageSliderSliderbgSix.adapter = sliderbgSixAdapter
    binding.imageSliderSliderbgSix.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorIndicatorThree.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorIndicatorThree.updateIndicatorCounts(binding.imageSliderSliderbgSix.indicatorCount)
    val listbgAdapter = ListbgAdapter(viewModel.listbgList.value?:mutableListOf())
    binding.recyclerListbg.adapter = listbgAdapter
    listbgAdapter.setOnItemClickListener(
    object : ListbgAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbg1RowModel) {
        onClickRecyclerListbg(view, position, item)
      }
    }
    )
    viewModel.listbgList.observe(this) {
      listbgAdapter.updateData(it)
    }
    val listbgTwoAdapter = ListbgTwoAdapter(viewModel.listbgTwoList.value?:mutableListOf())
    binding.recyclerListbgTwo.adapter = listbgTwoAdapter
    listbgTwoAdapter.setOnItemClickListener(
    object : ListbgTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbgTwoRowModel) {
        onClickRecyclerListbgTwo(view, position, item)
      }
    }
    )
    viewModel.listbgTwoList.observe(this) {
      listbgTwoAdapter.updateData(it)
    }
    val tabbar2Adapter = Tabbar2Adapter(viewModel.tabbar2List.value?:mutableListOf())
    binding.recyclerTabbar2.adapter = tabbar2Adapter
    tabbar2Adapter.setOnItemClickListener(
    object : Tabbar2Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tabbar3RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(this) {
      tabbar2Adapter.updateData(it)
    }
    binding.homepageVoneVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderbitmap.pauseAutoScroll()
    binding.imageSliderSliderbgFour.pauseAutoScroll()
    binding.imageSliderSliderbgFive.pauseAutoScroll()
    binding.imageSliderSliderbgSix.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderbitmap.resumeAutoScroll()
    binding.imageSliderSliderbgFour.resumeAutoScroll()
    binding.imageSliderSliderbgFive.resumeAutoScroll()
    binding.imageSliderSliderbgSix.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListbg(
    view: View,
    position: Int,
    item: Listbg1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListbgTwo(
    view: View,
    position: Int,
    item: ListbgTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_VONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageVoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
