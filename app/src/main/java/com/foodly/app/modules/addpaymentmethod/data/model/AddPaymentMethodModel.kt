package com.foodly.app.modules.addpaymentmethod.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class AddPaymentMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddyourpaymen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_your_paymen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThiscardwill: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_card_will)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt434343434343: String? =
      MyApp.getInstance().resources.getString(R.string.msg_4343_4343_4343)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScanCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etDateValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDateCopyValue: String? = null
)
