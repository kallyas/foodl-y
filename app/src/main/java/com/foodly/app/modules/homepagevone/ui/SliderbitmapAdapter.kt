package com.foodly.app.modules.homepagevone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemHomepageVone1Binding
import com.foodly.app.modules.homepagevone.`data`.model.ImageSliderSliderbitmapModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbitmapAdapter(
  val dataList: ArrayList<ImageSliderSliderbitmapModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbitmapModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHomepageVone1Binding) {
      binding.imageSliderSliderbitmapModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomepageVone1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
