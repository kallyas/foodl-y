package com.foodly.app.modules.filtersvtwo.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListctaseconderyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASecondery: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASeconderyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_brunch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASeconderyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_dinner)

)
