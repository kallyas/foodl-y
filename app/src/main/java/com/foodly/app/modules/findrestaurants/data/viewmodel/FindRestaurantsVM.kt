package com.foodly.app.modules.findrestaurants.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.findrestaurants.`data`.model.FindRestaurantsModel
import com.foodly.app.modules.findrestaurants.`data`.model.GridbgRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FindRestaurantsVM : ViewModel(), KoinComponent {
  val findRestaurantsModel: MutableLiveData<FindRestaurantsModel> =
      MutableLiveData(FindRestaurantsModel())

  var navArguments: Bundle? = null

  val gridbgList: MutableLiveData<MutableList<GridbgRowModel>> = MutableLiveData(mutableListOf())
}
