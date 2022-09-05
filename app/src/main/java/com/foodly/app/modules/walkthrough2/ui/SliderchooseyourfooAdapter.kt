package com.foodly.app.modules.walkthrough2.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemWalkthrough3Binding
import com.foodly.app.modules.walkthrough2.`data`.model.ImageSliderSliderchooseyourfooModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderchooseyourfooAdapter(
  val dataList: ArrayList<ImageSliderSliderchooseyourfooModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderchooseyourfooModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemWalkthrough3Binding) {
      binding.imageSliderSliderchooseyourfooModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemWalkthrough3Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
