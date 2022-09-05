package com.foodly.app.modules.findrestaurants.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class FindRestaurantsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopPickRestau: String? =
      MyApp.getInstance().resources.getString(R.string.msg_top_pick_restau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASecondery: String? = MyApp.getInstance().resources.getString(R.string.lbl_burgers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASeconderyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_brunch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCTASeconderyC: String? = MyApp.getInstance().resources.getString(R.string.lbl_breakfast)

)
