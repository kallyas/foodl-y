package com.foodly.app.modules.homepagevfour.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityHomepageVfourBinding
import com.foodly.app.modules.homepagevfour.`data`.model.ImageSliderSlidershadowModel
import com.foodly.app.modules.homepagevfour.`data`.model.SpinnerDeliveryaddresModel
import com.foodly.app.modules.homepagevfour.`data`.model.StaggeredbgThreeRowModel
import com.foodly.app.modules.homepagevfour.`data`.viewmodel.HomepageVfourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomepageVfourActivity :
    BaseActivity<ActivityHomepageVfourBinding>(R.layout.activity_homepage_vfour) {
  private val imageUri: Uri = Uri.parse("android.resource://com.foodly.app/drawable/img_shadow")


  private val imageSliderSlidershadowItems: ArrayList<ImageSliderSlidershadowModel> =
      arrayListOf(ImageSliderSlidershadowModel(imageShadow =
  imageUri.toString()),ImageSliderSlidershadowModel(imageShadow = imageUri.toString()))


  private val viewModel: HomepageVfourVM by viewModels<HomepageVfourVM>()

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
    val slidershadowAdapter = SlidershadowAdapter(imageSliderSlidershadowItems,true)
    binding.imageSliderSlidershadow.adapter = slidershadowAdapter
    val staggeredbgThreeAdapter =
    StaggeredbgThreeAdapter(viewModel.staggeredbgThreeList.value?:mutableListOf())
    binding.recyclerStaggeredbgThree.adapter = staggeredbgThreeAdapter
    staggeredbgThreeAdapter.setOnItemClickListener(
    object : StaggeredbgThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StaggeredbgThreeRowModel) {
        onClickRecyclerStaggeredbgThree(view, position, item)
      }
    }
    )
    viewModel.staggeredbgThreeList.observe(this) {
      staggeredbgThreeAdapter.updateData(it)
    }
    binding.homepageVfourVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidershadow.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidershadow.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggeredbgThree(
    view: View,
    position: Int,
    item: StaggeredbgThreeRowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGE_VFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageVfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
