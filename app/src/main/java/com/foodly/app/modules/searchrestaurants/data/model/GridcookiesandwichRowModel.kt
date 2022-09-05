package com.foodly.app.modules.searchrestaurants.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class GridcookiesandwichRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookieSandwich: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_halal_guys)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)

)
