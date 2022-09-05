package com.foodly.app.modules.searchresultsvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultsVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBurgers: String? = MyApp.getInstance().resources.getString(R.string.lbl_burgers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt80Resultsfoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_80_results_foun)

)
