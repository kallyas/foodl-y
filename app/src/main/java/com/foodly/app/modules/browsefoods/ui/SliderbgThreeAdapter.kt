package com.foodly.app.modules.browsefoods.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemBrowseFoods4Binding
import com.foodly.app.modules.browsefoods.`data`.model.ImageSliderSliderbgThreeModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbgThreeAdapter(
  val dataList: ArrayList<ImageSliderSliderbgThreeModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbgThreeModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemBrowseFoods4Binding) {
      binding.imageSliderSliderbgThreeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemBrowseFoods4Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
