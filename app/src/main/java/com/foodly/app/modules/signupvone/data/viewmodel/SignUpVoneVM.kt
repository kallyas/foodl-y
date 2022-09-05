package com.foodly.app.modules.signupvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.signupvone.`data`.model.SignUpVoneModel
import org.koin.core.KoinComponent

class SignUpVoneVM : ViewModel(), KoinComponent {
  val signUpVoneModel: MutableLiveData<SignUpVoneModel> = MutableLiveData(SignUpVoneModel())

  var navArguments: Bundle? = null
}
