package com.foodly.app.modules.resetemail.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ResetEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResetemailsen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reset_email_sen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWehavesenta: String? = MyApp.getInstance().resources.getString(R.string.msg_we_have_sent_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHavingproblem: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_having_problem)

)
