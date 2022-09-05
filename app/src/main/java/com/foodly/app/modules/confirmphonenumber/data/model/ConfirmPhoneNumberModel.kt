package com.foodly.app.modules.confirmphonenumber.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ConfirmPhoneNumberModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoFoodly: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_login_to_foodly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifyphonenu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verify_phone_nu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterthe4Dig: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_the_4_dig)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidntreceive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_receive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendAgain: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend_again)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_y)

)
