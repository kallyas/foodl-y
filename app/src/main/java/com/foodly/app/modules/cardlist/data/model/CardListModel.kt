package com.foodly.app.modules.cardlist.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class CardListModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethods: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_methods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPayPal: String? = MyApp.getInstance().resources.getString(R.string.lbl_paypal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeafultPayment: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_deafult_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPayPalOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_mastercard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeafultPaymentOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_not_deafult)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPayPalTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_visa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeafultPaymentTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_not_deafult)

)
