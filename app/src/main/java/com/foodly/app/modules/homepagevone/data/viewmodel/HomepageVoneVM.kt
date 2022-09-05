package com.foodly.app.modules.homepagevone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.homepagevone.`data`.model.HomepageVoneModel
import com.foodly.app.modules.homepagevone.`data`.model.Listbg1RowModel
import com.foodly.app.modules.homepagevone.`data`.model.ListbgTwoRowModel
import com.foodly.app.modules.homepagevone.`data`.model.SpinnerDeliveryaddresModel
import com.foodly.app.modules.homepagevone.`data`.model.Tabbar3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageVoneVM : ViewModel(), KoinComponent {
  val homepageVoneModel: MutableLiveData<HomepageVoneModel> = MutableLiveData(HomepageVoneModel())

  var navArguments: Bundle? = null

  val spinnerDeliveryaddresList: MutableLiveData<MutableList<SpinnerDeliveryaddresModel>> =
      MutableLiveData()

  val listbgList: MutableLiveData<MutableList<Listbg1RowModel>> = MutableLiveData(mutableListOf())

  val listbgTwoList: MutableLiveData<MutableList<ListbgTwoRowModel>> =
      MutableLiveData(mutableListOf())

  val tabbar2List: MutableLiveData<MutableList<Tabbar3RowModel>> = MutableLiveData(mutableListOf())
}
