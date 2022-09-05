package com.foodly.app.modules.singlerestaurants.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.singlerestaurants.`data`.model.SingleRestaurantsModel
import org.koin.core.KoinComponent

class SingleRestaurantsVM : ViewModel(), KoinComponent {
  val singleRestaurantsModel: MutableLiveData<SingleRestaurantsModel> =
      MutableLiveData(SingleRestaurantsModel())

  var navArguments: Bundle? = null
}
