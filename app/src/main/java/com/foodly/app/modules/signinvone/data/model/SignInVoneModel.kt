package com.foodly.app.modules.signinvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class SignInVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometo: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_enter_your_phon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreatenewacco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forget_password)
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
  var etForm1ActiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etForm1DeactiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFacebookValue: String? = null
)
