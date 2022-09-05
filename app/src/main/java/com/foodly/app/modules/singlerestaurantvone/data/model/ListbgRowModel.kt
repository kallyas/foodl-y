package com.foodly.app.modules.singlerestaurantvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListbgRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCookieSandwich: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cookie_sandwich)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)

)
