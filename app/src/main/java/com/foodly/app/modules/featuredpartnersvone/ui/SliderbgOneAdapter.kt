package com.foodly.app.modules.featuredpartnersvone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.foodly.app.databinding.SlideritemFeaturedPartnersVone2Binding
import com.foodly.app.modules.featuredpartnersvone.`data`.model.ImageSliderSliderbgOneModel
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
    if (binding is SlideritemFeaturedPartnersVone2Binding) {
      binding.imageSliderSliderbgOneModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemFeaturedPartnersVone2Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
