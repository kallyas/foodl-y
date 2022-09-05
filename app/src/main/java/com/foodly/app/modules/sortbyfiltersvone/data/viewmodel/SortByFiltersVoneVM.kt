package com.foodly.app.modules.sortbyfiltersvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.sortbyfiltersvone.`data`.model.SortByFiltersVoneModel
import org.koin.core.KoinComponent

class SortByFiltersVoneVM : ViewModel(), KoinComponent {
  val sortByFiltersVoneModel: MutableLiveData<SortByFiltersVoneModel> =
      MutableLiveData(SortByFiltersVoneModel())

  var navArguments: Bundle? = null
}
