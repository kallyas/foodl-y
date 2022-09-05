package com.foodly.app.modules.yourorders1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.yourorders1.`data`.model.Listone1RowModel
import com.foodly.app.modules.yourorders1.`data`.model.YourOrders1Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class YourOrders1VM : ViewModel(), KoinComponent {
  val yourOrders1Model: MutableLiveData<YourOrders1Model> = MutableLiveData(YourOrders1Model())

  var navArguments: Bundle? = null

  val listoneList: MutableLiveData<MutableList<Listone1RowModel>> = MutableLiveData(mutableListOf())
}
