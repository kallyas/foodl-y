package com.foodly.app.modules.enteraddress.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class EnterAddressModel(
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
  var txtUsecurrentloc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_current_loc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchformValue: String? = null
)
