package com.foodly.app.modules.searchresultsvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderbgModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHalalGuys: String? = MyApp.getInstance().resources.getString(R.string.lbl_mcdonald_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmerican: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeshifood: String? = MyApp.getInstance().resources.getString(R.string.lbl_deshi_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt200Ratings: String? = MyApp.getInstance().resources.getString(R.string.lbl_200_ratings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_min2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageBG: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageStar: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageClock: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageVolume: String? = ""

)
