package com.foodly.app.modules.featuredpartnersvtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.featuredpartnersvtwo.`data`.model.FeaturedPartnersVtwoModel
import com.foodly.app.modules.featuredpartnersvtwo.`data`.model.Gridbg1RowModel
import com.foodly.app.modules.featuredpartnersvtwo.`data`.model.Tabbar7RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FeaturedPartnersVtwoVM : ViewModel(), KoinComponent {
  val featuredPartnersVtwoModel: MutableLiveData<FeaturedPartnersVtwoModel> =
      MutableLiveData(FeaturedPartnersVtwoModel())

  var navArguments: Bundle? = null

  val gridbgList: MutableLiveData<MutableList<Gridbg1RowModel>> = MutableLiveData(mutableListOf())

  val tabbar2List: MutableLiveData<MutableList<Tabbar7RowModel>> = MutableLiveData(mutableListOf())
}
