package com.foodly.app.modules.homepagevthree.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemHomepageVthree3Binding
import com.foodly.app.modules.homepagevthree.`data`.model.ImageSliderSliderbgTwoModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbgTwoAdapter(
  val dataList: ArrayList<ImageSliderSliderbgTwoModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbgTwoModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHomepageVthree3Binding) {
      binding.imageSliderSliderbgTwoModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomepageVthree3Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
