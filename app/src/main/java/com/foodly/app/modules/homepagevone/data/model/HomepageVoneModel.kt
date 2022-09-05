package com.foodly.app.modules.homepagevone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDeliveryto: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeaturedPartne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_featured_partne)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_you_ve_to_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_free_delivery_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestPicksRest: String? =
      MyApp.getInstance().resources.getString(R.string.msg_best_picks_rest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllRestaurants: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_all_restaurants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
