package com.foodly.app.modules.singlerestaurantvtwo.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListfoodThree2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookieSandwichSix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_oyster_dish)
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
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_usd7_4)

)
