package com.foodly.app.modules.yourorders1.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class YourOrders1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourOrders: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtotalDelive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_subtotal_delive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_4_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalinclVA: String? = MyApp.getInstance().resources.getString(R.string.msg_total_incl_va)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddmoreitems: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_more_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPromocode: String? = MyApp.getInstance().resources.getString(R.string.lbl_promo_code)

)
