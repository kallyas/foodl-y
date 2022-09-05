package com.foodly.app.modules.homepagevone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemHomepageVone4Binding
import com.foodly.app.modules.homepagevone.`data`.model.ImageSliderSliderbgSixModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbgSixAdapter(
  val dataList: ArrayList<ImageSliderSliderbgSixModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbgSixModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHomepageVone4Binding) {
      binding.imageSliderSliderbgSixModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomepageVone4Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
