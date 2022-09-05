package com.foodly.app.modules.changepassword.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ChangePasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_profile_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailaddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etForm2FillValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etForm2FillOneValue: String? = null
)
