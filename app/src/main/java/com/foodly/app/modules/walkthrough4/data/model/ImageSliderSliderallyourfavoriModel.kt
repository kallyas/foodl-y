package com.foodly.app.modules.walkthrough4.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderallyourfavoriModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAllyourfavori: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_your_favori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderfromthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_from_the)

)
