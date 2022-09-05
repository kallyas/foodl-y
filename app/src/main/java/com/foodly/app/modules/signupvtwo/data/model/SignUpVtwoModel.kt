package com.foodly.app.modules.signupvtwo.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpVtwoModel(
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
  var txtEmailaddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_name2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailaddressOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailaddressTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
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
  var etGroup166Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFacebookValue: String? = null
)
