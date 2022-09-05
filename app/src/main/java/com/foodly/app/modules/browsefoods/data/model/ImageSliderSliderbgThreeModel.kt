package com.foodly.app.modules.browsefoods.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderbgThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHalalGuysThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cafe_brichor_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmericanThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeshifoodThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_deshi_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt200RatingsThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_200_ratings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_min2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageBGThree: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageStarThree: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageClockThree: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageVolumeThree: String? = ""

)
