package com.foodly.app.modules.orderdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.orderdetails.`data`.model.ListoneRowModel
import com.foodly.app.modules.orderdetails.`data`.model.OrderDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrderDetailsVM : ViewModel(), KoinComponent {
  val orderDetailsModel: MutableLiveData<OrderDetailsModel> = MutableLiveData(OrderDetailsModel())

  var navArguments: Bundle? = null

  val listoneList: MutableLiveData<MutableList<ListoneRowModel>> = MutableLiveData(mutableListOf())
}
