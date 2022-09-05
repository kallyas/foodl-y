package com.foodly.app.modules.homepagevone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class Listbg1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHalalGuys: String? =
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
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_25min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreedelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_free_delivery)

)
