package com.foodly.app.modules.searchfood.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SearchFoodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopCategories: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_top_categories)

)
