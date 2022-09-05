package com.foodly.app.modules.orderdetails1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.orderdetails1.`data`.model.OrderDetails1Model
import org.koin.core.KoinComponent

class OrderDetails1VM : ViewModel(), KoinComponent {
  val orderDetails1Model: MutableLiveData<OrderDetails1Model> =
      MutableLiveData(OrderDetails1Model())

  var navArguments: Bundle? = null
}
