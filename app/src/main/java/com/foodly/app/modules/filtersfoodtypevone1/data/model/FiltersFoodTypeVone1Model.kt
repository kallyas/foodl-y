package com.foodly.app.modules.filtersfoodtypevone1.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class FiltersFoodTypeVone1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtClearall: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)

)
