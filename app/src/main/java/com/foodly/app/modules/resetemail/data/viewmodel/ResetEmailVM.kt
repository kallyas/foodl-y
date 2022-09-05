package com.foodly.app.modules.resetemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.resetemail.`data`.model.ResetEmailModel
import org.koin.core.KoinComponent

class ResetEmailVM : ViewModel(), KoinComponent {
  val resetEmailModel: MutableLiveData<ResetEmailModel> = MutableLiveData(ResetEmailModel())

  var navArguments: Bundle? = null
}
