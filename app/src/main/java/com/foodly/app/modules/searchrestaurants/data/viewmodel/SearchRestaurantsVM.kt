package com.foodly.app.modules.searchrestaurants.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.searchrestaurants.`data`.model.GridcookiesandwichRowModel
import com.foodly.app.modules.searchrestaurants.`data`.model.ListcookiesandwichThreeRowModel
import com.foodly.app.modules.searchrestaurants.`data`.model.SearchRestaurantsModel
import com.foodly.app.modules.searchrestaurants.`data`.model.Tabbar8RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchRestaurantsVM : ViewModel(), KoinComponent {
  val searchRestaurantsModel: MutableLiveData<SearchRestaurantsModel> =
      MutableLiveData(SearchRestaurantsModel())

  var navArguments: Bundle? = null

  val gridcookiesandwichList: MutableLiveData<MutableList<GridcookiesandwichRowModel>> =
      MutableLiveData(mutableListOf())

  val listcookiesandwichThreeList: MutableLiveData<MutableList<ListcookiesandwichThreeRowModel>> =
      MutableLiveData(mutableListOf())

  val tabbar2List: MutableLiveData<MutableList<Tabbar8RowModel>> = MutableLiveData(mutableListOf())
}
