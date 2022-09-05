package com.foodly.app.modules.locations.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.locations.`data`.model.LocationsModel
import org.koin.core.KoinComponent

class LocationsVM : ViewModel(), KoinComponent {
  val locationsModel: MutableLiveData<LocationsModel> = MutableLiveData(LocationsModel())

  var navArguments: Bundle? = null
}
