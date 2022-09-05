package com.foodly.app.modules.walkthrough4.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemWalkthrough5Binding
import com.foodly.app.modules.walkthrough4.`data`.model.ImageSliderSliderallyourfavoriModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderallyourfavoriAdapter(
  val dataList: ArrayList<ImageSliderSliderallyourfavoriModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderallyourfavoriModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemWalkthrough5Binding) {
      binding.imageSliderSliderallyourfavoriModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemWalkthrough5Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
