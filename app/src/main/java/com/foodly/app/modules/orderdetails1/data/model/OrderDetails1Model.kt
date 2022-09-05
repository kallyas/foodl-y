package com.foodly.app.modules.orderdetails1.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class OrderDetails1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtYouPlacetheO: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_place_the_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_you_placed_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKeepBrowsing: String? = MyApp.getInstance().resources.getString(R.string.lbl_keep_browsing)

)
