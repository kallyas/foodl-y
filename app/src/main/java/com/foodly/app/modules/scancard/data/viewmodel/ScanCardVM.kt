package com.foodly.app.modules.scancard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.scancard.`data`.model.ScanCardModel
import org.koin.core.KoinComponent

class ScanCardVM : ViewModel(), KoinComponent {
  val scanCardModel: MutableLiveData<ScanCardModel> = MutableLiveData(ScanCardModel())

  var navArguments: Bundle? = null
}
