package com.foodly.app.modules.accountsettings.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class AccountSettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpdateyourset: String? =
      MyApp.getInstance().resources.getString(R.string.msg_update_your_set)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzim: String? = MyApp.getInstance().resources.getString(R.string.msg_profile_informa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyouracc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_your_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzimOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyouraccOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_your_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzimTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_methods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyouraccTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_your_credit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzimThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_locations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyouraccThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_or_remove_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzimFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_social_acco3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_add_facebook_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzimFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_refer_to_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_get_10_for_ref)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzimNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_rate_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyouraccSeven: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rate_us_playsto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNawfAzimTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_faq)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeyouraccEight: String? =
      MyApp.getInstance().resources.getString(R.string.msg_frequently_aske)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
