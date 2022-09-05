package com.foodly.app.modules.addpaymentmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.addpaymentmethod.`data`.model.AddPaymentMethodModel
import org.koin.core.KoinComponent

class AddPaymentMethodVM : ViewModel(), KoinComponent {
  val addPaymentMethodModel: MutableLiveData<AddPaymentMethodModel> =
      MutableLiveData(AddPaymentMethodModel())

  var navArguments: Bundle? = null
}
