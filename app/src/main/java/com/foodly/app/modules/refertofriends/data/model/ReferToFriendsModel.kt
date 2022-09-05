package com.foodly.app.modules.refertofriends.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class ReferToFriendsModel(
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
  var etWeburlValue: String? = null
)
