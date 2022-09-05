package com.foodly.app.modules.searchresultsvtwo.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultsVtwoModel(
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
  var txtWehavefounds: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_have_founds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchAgain: String? = MyApp.getInstance().resources.getString(R.string.lbl_search_again)

)
