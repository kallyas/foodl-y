package com.foodly.app.modules.singlerestaurantvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListfireRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)

)
