package com.foodly.app.modules.singlerestaurantvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListfoodRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookieSandwichThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cookie_sandwich)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortbreadcho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shortbread_cho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_usd7_4)

)
