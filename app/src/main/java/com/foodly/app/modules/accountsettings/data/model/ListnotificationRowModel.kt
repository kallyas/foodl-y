package com.foodly.app.modules.accountsettings.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListnotificationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzimSix: String? =
      MyApp.getInstance().resources.getString(R.string.msg_push_notificati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyouraccFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_for_daily_updat)

)
