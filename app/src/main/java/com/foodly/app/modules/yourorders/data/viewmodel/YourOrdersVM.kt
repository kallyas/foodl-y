package com.foodly.app.modules.yourorders.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.yourorders.`data`.model.Listfood1RowModel
import com.foodly.app.modules.yourorders.`data`.model.ListfoodThree1RowModel
import com.foodly.app.modules.yourorders.`data`.model.Tabbar5RowModel
import com.foodly.app.modules.yourorders.`data`.model.YourOrdersModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class YourOrdersVM : ViewModel(), KoinComponent {
  val yourOrdersModel: MutableLiveData<YourOrdersModel> = MutableLiveData(YourOrdersModel())

  var navArguments: Bundle? = null

  val listfoodList: MutableLiveData<MutableList<Listfood1RowModel>> =
      MutableLiveData(mutableListOf())

  val listfoodThreeList: MutableLiveData<MutableList<ListfoodThree1RowModel>> =
      MutableLiveData(mutableListOf())

  val tabbar2List: MutableLiveData<MutableList<Tabbar5RowModel>> = MutableLiveData(mutableListOf())
}
