package com.foodly.app.modules.searchfood.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class Gridbg2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFastFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_fast_food)

)
