package com.foodly.app.modules.signupvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourName: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyhaveac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_ac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
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
  var etForm1DeactiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etForm1DeactiveOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etForm1DeactiveTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFacebookValue: String? = null
)
