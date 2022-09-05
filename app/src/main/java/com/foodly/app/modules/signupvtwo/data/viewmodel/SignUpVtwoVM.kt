package com.foodly.app.modules.signupvtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.signupvtwo.`data`.model.SignUpVtwoModel
import org.koin.core.KoinComponent

class SignUpVtwoVM : ViewModel(), KoinComponent {
  val signUpVtwoModel: MutableLiveData<SignUpVtwoModel> = MutableLiveData(SignUpVtwoModel())

  var navArguments: Bundle? = null
}
