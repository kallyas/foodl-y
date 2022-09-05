package com.foodly.app.modules.icons3434.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.icons3434.`data`.model.Icons3434Model
import com.foodly.app.modules.icons3434.`data`.model.ListlockRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Icons3434VM : ViewModel(), KoinComponent {
  val icons3434Model: MutableLiveData<Icons3434Model> = MutableLiveData(Icons3434Model())

  var navArguments: Bundle? = null

  val listlockList: MutableLiveData<MutableList<ListlockRowModel>> =
      MutableLiveData(mutableListOf())
}
