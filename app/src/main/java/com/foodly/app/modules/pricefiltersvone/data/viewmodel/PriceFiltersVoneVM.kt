package com.foodly.app.modules.pricefiltersvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.pricefiltersvone.`data`.model.PriceFiltersVoneModel
import org.koin.core.KoinComponent

class PriceFiltersVoneVM : ViewModel(), KoinComponent {
  val priceFiltersVoneModel: MutableLiveData<PriceFiltersVoneModel> =
      MutableLiveData(PriceFiltersVoneModel())

  var navArguments: Bundle? = null
}
