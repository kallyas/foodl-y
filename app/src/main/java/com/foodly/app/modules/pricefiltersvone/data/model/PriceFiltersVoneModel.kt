package com.foodly.app.modules.pricefiltersvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class PriceFiltersVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMaxDeliveryFe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_max_delivery_fe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceRange: String? = MyApp.getInstance().resources.getString(R.string.lbl_price_range2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupCopy: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupCopyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupCopyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupCopyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComplete: String? = MyApp.getInstance().resources.getString(R.string.lbl_complete)

)
