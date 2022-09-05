package com.foodly.app.modules.searchingfood.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SearchingFoodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentSearches: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_searches)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearall: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubway: String? = MyApp.getInstance().resources.getString(R.string.lbl_subway)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBurgers: String? = MyApp.getInstance().resources.getString(R.string.lbl_burgers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSandwich: String? = MyApp.getInstance().resources.getString(R.string.lbl_sandwich)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_pizza)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFriedRicewith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fried_rice_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBakery: String? = MyApp.getInstance().resources.getString(R.string.lbl_bakery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCake: String? = MyApp.getInstance().resources.getString(R.string.lbl_cake)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCookies: String? = MyApp.getInstance().resources.getString(R.string.lbl_cookies)

)
