package com.foodly.app.modules.browsefoods.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class BrowseFoodsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBrowseFoods: String? = MyApp.getInstance().resources.getString(R.string.lbl_browse_foods)

)
