package com.foodly.app.modules.locations.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class LocationsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethods: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_methods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpcomingorders: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearall: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSanFrancisco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_san_francisco2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSanFranciscoC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_san_francisco_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSanFranciscoZ: String? =
      MyApp.getInstance().resources.getString(R.string.msg_san_francisco_z)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSanFranciscoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_san_francisco3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchformValue: String? = null
)
