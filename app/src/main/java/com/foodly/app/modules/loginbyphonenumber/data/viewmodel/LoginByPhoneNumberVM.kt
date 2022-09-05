package com.foodly.app.modules.loginbyphonenumber.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.loginbyphonenumber.`data`.model.LoginByPhoneNumberModel
import org.koin.core.KoinComponent

class LoginByPhoneNumberVM : ViewModel(), KoinComponent {
  val loginByPhoneNumberModel: MutableLiveData<LoginByPhoneNumberModel> =
      MutableLiveData(LoginByPhoneNumberModel())

  var navArguments: Bundle? = null
}
