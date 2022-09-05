package com.foodly.app.modules.confirmphonenumber.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.confirmphonenumber.`data`.model.ConfirmPhoneNumberModel
import org.koin.core.KoinComponent

class ConfirmPhoneNumberVM : ViewModel(), KoinComponent {
  val confirmPhoneNumberModel: MutableLiveData<ConfirmPhoneNumberModel> =
      MutableLiveData(ConfirmPhoneNumberModel())

  var navArguments: Bundle? = null
}
