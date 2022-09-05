package com.foodly.app.modules.homepagevthree.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageVthreeModel(
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
  var txtTypeofFoods: String? = MyApp.getInstance().resources.getString(R.string.lbl_type_of_foods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
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
  var txtNewRestaurants: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_restaurants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
