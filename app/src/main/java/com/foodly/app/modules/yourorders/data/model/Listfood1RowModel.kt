package com.foodly.app.modules.yourorders.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class Listfood1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookieSandwich: String? = MyApp.getInstance().resources.getString(R.string.lbl_mcdonald_s)
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
  var txtTwentyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_usd7_4)

)
