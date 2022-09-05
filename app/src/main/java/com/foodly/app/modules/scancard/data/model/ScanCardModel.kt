package com.foodly.app.modules.scancard.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ScanCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanYourCard: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scan_your_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.msg_just_my_luck_n)

)
