package com.foodly.app.modules.icons2424.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.icons2424.`data`.model.Icons2424Model
import com.foodly.app.modules.icons2424.`data`.model.ListfolderRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Icons2424VM : ViewModel(), KoinComponent {
  val icons2424Model: MutableLiveData<Icons2424Model> = MutableLiveData(Icons2424Model())

  var navArguments: Bundle? = null

  val listfolderList: MutableLiveData<MutableList<ListfolderRowModel>> =
      MutableLiveData(mutableListOf())
}
