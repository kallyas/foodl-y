package com.foodly.app.modules.filtersvtwo.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ListdietaryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDietary: String? = MyApp.getInstance().resources.getString(R.string.lbl_dietary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearallCopy: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASeconderyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_any)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASeconderyOneThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vegetarian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASeconderyTwoTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_vegan)

)
