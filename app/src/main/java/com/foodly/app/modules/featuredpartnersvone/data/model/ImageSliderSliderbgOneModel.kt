package com.foodly.app.modules.featuredpartnersvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderbgOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHalalGuysOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cafe_brichor_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixteen: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmericanOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeshifoodOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_deshi_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt200RatingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_200_ratings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_min2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageBGOne: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageStarOne: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageClockOne: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageVolumeOne: String? = ""

)
