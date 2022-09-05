package com.foodly.app.modules.typelocation.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListsendRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSanFrancisco: String? = MyApp.getInstance().resources.getString(R.string.lbl_san_francisco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalifornia: String? = MyApp.getInstance().resources.getString(R.string.lbl_california)

)
