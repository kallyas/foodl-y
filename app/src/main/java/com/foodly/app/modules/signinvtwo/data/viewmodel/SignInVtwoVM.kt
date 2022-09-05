package com.foodly.app.modules.signinvtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.signinvtwo.`data`.model.SignInVtwoModel
import org.koin.core.KoinComponent

class SignInVtwoVM : ViewModel(), KoinComponent {
  val signInVtwoModel: MutableLiveData<SignInVtwoModel> = MutableLiveData(SignInVtwoModel())

  var navArguments: Bundle? = null
}
