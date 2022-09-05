package com.foodly.app.modules.sharelinkpopup.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ShareLinkPopupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRefertoFriend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_refer_to_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_refer_a_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_get_10_in_cred)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.msg_https_ui8_net)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScanCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_others)

)
