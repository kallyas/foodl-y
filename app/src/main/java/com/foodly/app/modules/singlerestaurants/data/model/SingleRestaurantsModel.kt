package com.foodly.app.modules.singlerestaurants.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SingleRestaurantsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRichTable: String? = MyApp.getInstance().resources.getString(R.string.lbl_rich_table)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_25min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreedelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_free_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSanFrancisco: String? = MyApp.getInstance().resources.getString(R.string.msg_san_francisco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsRevie: String? = MyApp.getInstance().resources.getString(R.string.msg_ratings_revie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreatfoodIli: String? =
      MyApp.getInstance().resources.getString(R.string.msg_great_food_i_li)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_42)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneofthebest: String? =
      MyApp.getInstance().resources.getString(R.string.msg_one_of_the_best)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGreatfoodIliOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_great_food_i_li)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_42)

)
