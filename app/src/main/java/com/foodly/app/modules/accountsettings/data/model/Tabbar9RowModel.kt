package com.foodly.app.modules.accountsettings.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class Tabbar9RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
