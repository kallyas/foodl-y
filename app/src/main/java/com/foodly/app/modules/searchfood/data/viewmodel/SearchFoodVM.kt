package com.foodly.app.modules.searchfood.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.searchfood.`data`.model.Gridbg2RowModel
import com.foodly.app.modules.searchfood.`data`.model.SearchFoodModel
import com.foodly.app.modules.searchfood.`data`.model.Tabbar10RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchFoodVM : ViewModel(), KoinComponent {
  val searchFoodModel: MutableLiveData<SearchFoodModel> = MutableLiveData(SearchFoodModel())

  var navArguments: Bundle? = null

  val gridbgList: MutableLiveData<MutableList<Gridbg2RowModel>> = MutableLiveData(mutableListOf())

  val tabbar2List: MutableLiveData<MutableList<Tabbar10RowModel>> = MutableLiveData(mutableListOf())
}
