package com.foodly.app.modules.addsocialaccounts.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class AddSocialAccountsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddSocialAcco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_social_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddsocialaccoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_social_acco2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddyoursocial: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_your_social)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConnectwithgo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_connect_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFacebookValue: String? = null
)
