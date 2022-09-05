package com.foodly.app.modules.addtoorder.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.addtoorder.`data`.model.AddToOrderModel
import org.koin.core.KoinComponent

class AddToOrderVM : ViewModel(), KoinComponent {
  val addToOrderModel: MutableLiveData<AddToOrderModel> = MutableLiveData(AddToOrderModel())

  var navArguments: Bundle? = null
}
