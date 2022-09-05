package com.foodly.app.modules.walkthrough.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemWalkthrough1Binding
import com.foodly.app.modules.walkthrough.`data`.model.ImageSliderSliderfreedeliveryoModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderfreedeliveryoAdapter(
  val dataList: ArrayList<ImageSliderSliderfreedeliveryoModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderfreedeliveryoModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemWalkthrough1Binding) {
      binding.imageSliderSliderfreedeliveryoModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemWalkthrough1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
