package com.foodly.app.modules.findrestaurants.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class GridbgRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_25min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFree: String? = MyApp.getInstance().resources.getString(R.string.lbl_free)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheHalalGuys: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_nethai_kitchen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmerican: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)

)
