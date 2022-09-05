package com.foodly.app.modules.featuredpartnersvtwo.`data`.model

import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import kotlin.String

data class FeaturedPartnersVtwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFeaturedPartne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_featured_partne)

)
