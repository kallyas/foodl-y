package com.foodly.app.modules.typelocation.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class TypeLocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_find_restaurant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenteryo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSanFrans: String? = MyApp.getInstance().resources.getString(R.string.lbl_san_frans)

)
