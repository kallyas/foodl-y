package com.foodly.app.modules.homepagevone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemHomepageVone2Binding
import com.foodly.app.modules.homepagevone.`data`.model.ImageSliderSliderbgFourModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbgFourAdapter(
  val dataList: ArrayList<ImageSliderSliderbgFourModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbgFourModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHomepageVone2Binding) {
      binding.imageSliderSliderbgFourModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomepageVone2Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
