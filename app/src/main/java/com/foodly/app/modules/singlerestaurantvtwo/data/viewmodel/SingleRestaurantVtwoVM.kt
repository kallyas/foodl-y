package com.foodly.app.modules.singlerestaurantvtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listbg2RowModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listfire1RowModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listfood2RowModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.ListfoodThree2RowModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.SingleRestaurantVtwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SingleRestaurantVtwoVM : ViewModel(), KoinComponent {
  val singleRestaurantVtwoModel: MutableLiveData<SingleRestaurantVtwoModel> =
      MutableLiveData(SingleRestaurantVtwoModel())

  var navArguments: Bundle? = null

  val listfireList: MutableLiveData<MutableList<Listfire1RowModel>> =
      MutableLiveData(mutableListOf())

  val listbgList: MutableLiveData<MutableList<Listbg2RowModel>> = MutableLiveData(mutableListOf())

  val listfoodList: MutableLiveData<MutableList<Listfood2RowModel>> =
      MutableLiveData(mutableListOf())

  val listfoodThreeList: MutableLiveData<MutableList<ListfoodThree2RowModel>> =
      MutableLiveData(mutableListOf())
}
