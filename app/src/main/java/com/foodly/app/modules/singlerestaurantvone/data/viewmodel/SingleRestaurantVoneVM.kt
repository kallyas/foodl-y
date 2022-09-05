package com.foodly.app.modules.singlerestaurantvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListbgRowModel
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfireRowModel
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfoodRowModel
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfoodThreeRowModel
import com.foodly.app.modules.singlerestaurantvone.`data`.model.SingleRestaurantVoneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SingleRestaurantVoneVM : ViewModel(), KoinComponent {
  val singleRestaurantVoneModel: MutableLiveData<SingleRestaurantVoneModel> =
      MutableLiveData(SingleRestaurantVoneModel())

  var navArguments: Bundle? = null

  val listfireList: MutableLiveData<MutableList<ListfireRowModel>> =
      MutableLiveData(mutableListOf())

  val listbgList: MutableLiveData<MutableList<ListbgRowModel>> = MutableLiveData(mutableListOf())

  val listfoodList: MutableLiveData<MutableList<ListfoodRowModel>> =
      MutableLiveData(mutableListOf())

  val listfoodThreeList: MutableLiveData<MutableList<ListfoodThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
