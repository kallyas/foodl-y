package com.foodly.app.modules.featuredpartnersvone.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class FeaturedPartnersVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFeaturedPartne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_featured_partne)

)
