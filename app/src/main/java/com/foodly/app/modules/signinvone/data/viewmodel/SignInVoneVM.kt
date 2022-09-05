package com.foodly.app.modules.signinvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.signinvone.`data`.model.SignInVoneModel
import org.koin.core.KoinComponent

class SignInVoneVM : ViewModel(), KoinComponent {
  val signInVoneModel: MutableLiveData<SignInVoneModel> = MutableLiveData(SignInVoneModel())

  var navArguments: Bundle? = null
}
