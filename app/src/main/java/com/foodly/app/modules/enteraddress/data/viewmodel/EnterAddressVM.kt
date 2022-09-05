package com.foodly.app.modules.enteraddress.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.enteraddress.`data`.model.EnterAddressModel
import org.koin.core.KoinComponent

class EnterAddressVM : ViewModel(), KoinComponent {
  val enterAddressModel: MutableLiveData<EnterAddressModel> = MutableLiveData(EnterAddressModel())

  var navArguments: Bundle? = null
}
