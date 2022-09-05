package com.foodly.app.modules.homepagevone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemHomepageVone3Binding
import com.foodly.app.modules.homepagevone.`data`.model.ImageSliderSliderbgFiveModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbgFiveAdapter(
  val dataList: ArrayList<ImageSliderSliderbgFiveModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbgFiveModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHomepageVone3Binding) {
      binding.imageSliderSliderbgFiveModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomepageVone3Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
