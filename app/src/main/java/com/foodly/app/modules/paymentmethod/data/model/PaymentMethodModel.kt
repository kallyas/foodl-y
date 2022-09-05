package com.foodly.app.modules.paymentmethod.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethods: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_methods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonthaveany: String? = MyApp.getInstance().resources.getString(R.string.msg_don_t_have_any)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItsseemslike: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_s_seems_like)

)
