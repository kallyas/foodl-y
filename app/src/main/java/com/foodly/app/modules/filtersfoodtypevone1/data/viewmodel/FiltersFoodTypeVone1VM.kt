package com.foodly.app.modules.filtersfoodtypevone1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.filtersfoodtypevone1.`data`.model.FiltersFoodTypeVone1Model
import org.koin.core.KoinComponent

class FiltersFoodTypeVone1VM : ViewModel(), KoinComponent {
  val filtersFoodTypeVone1Model: MutableLiveData<FiltersFoodTypeVone1Model> =
      MutableLiveData(FiltersFoodTypeVone1Model())

  var navArguments: Bundle? = null
}
