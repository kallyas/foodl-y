package com.foodly.app.modules.singlerestaurantvtwo.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SingleRestaurantVtwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMayfieldBakery: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mayfield_bakery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_chinese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmerican: String? = MyApp.getInstance().resources.getString(R.string.lbl_american)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeshifood: String? = MyApp.getInstance().resources.getString(R.string.lbl_deshi_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt200Ratings: String? = MyApp.getInstance().resources.getString(R.string.lbl_200_ratings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeaturedItems: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_featured_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeefLamb: String? = MyApp.getInstance().resources.getString(R.string.lbl_beef_lamb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeafood: String? = MyApp.getInstance().resources.getString(R.string.lbl_seafood)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppetizers: String? = MyApp.getInstance().resources.getString(R.string.lbl_appetizers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDimSum: String? = MyApp.getInstance().resources.getString(R.string.lbl_dim_sum2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMostPopulars: String? = MyApp.getInstance().resources.getString(R.string.lbl_most_populars)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeaFoods: String? = MyApp.getInstance().resources.getString(R.string.lbl_sea_foods)

)
