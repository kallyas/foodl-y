package com.foodly.app.modules.walkthrough4.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.walkthrough4.`data`.model.Walkthrough4Model
import org.koin.core.KoinComponent

class Walkthrough4VM : ViewModel(), KoinComponent {
  val walkthrough4Model: MutableLiveData<Walkthrough4Model> = MutableLiveData(Walkthrough4Model())

  var navArguments: Bundle? = null
}
