package com.foodly.app.modules.loginbyphonenumber.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class LoginByPhoneNumberModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoFoodly: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_login_to_foodly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetstartedwit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_get_started_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourphon: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_phon3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5013332982: String? = MyApp.getInstance().resources.getString(R.string.lbl_501_333_2982)

)
