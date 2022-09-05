package com.foodly.app.modules.walkthrough2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.walkthrough2.`data`.model.Walkthrough2Model
import org.koin.core.KoinComponent

class Walkthrough2VM : ViewModel(), KoinComponent {
  val walkthrough2Model: MutableLiveData<Walkthrough2Model> = MutableLiveData(Walkthrough2Model())

  var navArguments: Bundle? = null
}
