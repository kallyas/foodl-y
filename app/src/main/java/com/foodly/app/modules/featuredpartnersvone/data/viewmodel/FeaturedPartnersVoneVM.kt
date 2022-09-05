package com.foodly.app.modules.featuredpartnersvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.featuredpartnersvone.`data`.model.FeaturedPartnersVoneModel
import com.foodly.app.modules.featuredpartnersvone.`data`.model.Tabbar2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FeaturedPartnersVoneVM : ViewModel(), KoinComponent {
  val featuredPartnersVoneModel: MutableLiveData<FeaturedPartnersVoneModel> =
      MutableLiveData(FeaturedPartnersVoneModel())

  var navArguments: Bundle? = null

  val tabbar2List: MutableLiveData<MutableList<Tabbar2RowModel>> = MutableLiveData(mutableListOf())
}
