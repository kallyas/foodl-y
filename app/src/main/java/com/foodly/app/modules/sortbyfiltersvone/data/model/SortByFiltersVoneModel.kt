package com.foodly.app.modules.sortbyfiltersvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SortByFiltersVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecomended: String? = MyApp.getInstance().resources.getString(R.string.lbl_recomended)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFastestDeliver: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fastest_deliver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMostPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_most_popular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComplete: String? = MyApp.getInstance().resources.getString(R.string.lbl_complete)

)
