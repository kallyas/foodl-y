package com.foodly.app.modules.walkthrough.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderfreedeliveryoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFreedeliveryo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_free_delivery_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreedeliveryf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_free_delivery_f2)

)
