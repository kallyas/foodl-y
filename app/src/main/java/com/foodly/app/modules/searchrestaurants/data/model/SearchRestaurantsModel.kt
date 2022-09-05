package com.foodly.app.modules.searchrestaurants.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SearchRestaurantsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopRestaurants: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_top_restaurants)

)
