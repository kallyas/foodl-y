package com.foodly.app.modules.walkthrough2.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderchooseyourfooModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseyourfoo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_foo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEasilyfindyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_easily_find_you)

)
