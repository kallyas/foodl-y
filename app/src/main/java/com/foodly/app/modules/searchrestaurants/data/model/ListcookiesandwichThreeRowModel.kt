package com.foodly.app.modules.searchrestaurants.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListcookiesandwichThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookieSandwichThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cookie_sandwich)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)

)
