package com.foodly.app.modules.yourorders1.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class Listone1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookieSandwich: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cookie_sandwich)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_usd7_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortbreadcho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shortbread_cho)

)
