package com.foodly.app.modules.yourorders.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListfoodThree1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookieSandwichThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cafe_brichor_s2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortbreadchoThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shortbread_cho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_usd7_4)

)
