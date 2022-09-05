package com.foodly.app.modules.filtersfoodtypevone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class FiltersFoodTypeVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBurgers120: String? = MyApp.getInstance().resources.getString(R.string.lbl_burgers_120)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBurgers120One: String? = MyApp.getInstance().resources.getString(R.string.lbl_pizza_187)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBurgers120Two: String? = MyApp.getInstance().resources.getString(R.string.lbl_soups_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBurgers120Three: String? = MyApp.getInstance().resources.getString(R.string.lbl_sandwich)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComplete: String? = MyApp.getInstance().resources.getString(R.string.lbl_complete)

)
