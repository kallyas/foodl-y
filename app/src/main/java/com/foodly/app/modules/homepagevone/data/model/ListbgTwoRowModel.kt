package com.foodly.app.modules.homepagevone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListbgTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHalalGuysTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mcdonald_s2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColarodoSanFTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_colarodo_san_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_25min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreedeliveryTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_free_delivery)

)
