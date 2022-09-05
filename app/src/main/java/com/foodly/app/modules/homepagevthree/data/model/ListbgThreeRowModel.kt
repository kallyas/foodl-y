package com.foodly.app.modules.homepagevthree.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListbgThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHalalGuysThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_daylight_coffee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColarodoSanF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_colarodo_san_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_25min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreedelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_free_delivery)

)
