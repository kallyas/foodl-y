package com.foodly.app.modules.browsefoods.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemBrowseFoods2Binding
import com.foodly.app.modules.browsefoods.`data`.model.ImageSliderSliderbgOneModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbgOneAdapter(
  val dataList: ArrayList<ImageSliderSliderbgOneModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbgOneModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemBrowseFoods2Binding) {
      binding.imageSliderSliderbgOneModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemBrowseFoods2Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
