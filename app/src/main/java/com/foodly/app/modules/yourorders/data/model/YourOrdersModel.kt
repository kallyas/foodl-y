package com.foodly.app.modules.yourorders.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class YourOrdersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUpcomingorders: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upcoming_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearall: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpcomingordersOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_past_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)

)
