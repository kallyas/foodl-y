package com.foodly.app.modules.profilesettings.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileSettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_profile_setting)
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
  var txtEmailaddressTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup160Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup164Value: String? = null
)
