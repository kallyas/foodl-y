package com.foodly.app.modules.searchingfood.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.searchingfood.`data`.model.SearchingFoodModel
import org.koin.core.KoinComponent

class SearchingFoodVM : ViewModel(), KoinComponent {
  val searchingFoodModel: MutableLiveData<SearchingFoodModel> =
      MutableLiveData(SearchingFoodModel())

  var navArguments: Bundle? = null
}
