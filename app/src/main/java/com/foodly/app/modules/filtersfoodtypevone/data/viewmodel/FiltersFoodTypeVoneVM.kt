package com.foodly.app.modules.filtersfoodtypevone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.filtersfoodtypevone.`data`.model.FiltersFoodTypeVoneModel
import org.koin.core.KoinComponent

class FiltersFoodTypeVoneVM : ViewModel(), KoinComponent {
  val filtersFoodTypeVoneModel: MutableLiveData<FiltersFoodTypeVoneModel> =
      MutableLiveData(FiltersFoodTypeVoneModel())

  var navArguments: Bundle? = null
}
