package com.foodly.app.modules.homepagevthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.homepagevthree.`data`.model.HomepageVthreeModel
import com.foodly.app.modules.homepagevthree.`data`.model.ListbgThreeRowModel
import com.foodly.app.modules.homepagevthree.`data`.model.SpinnerDeliveryaddresModel
import com.foodly.app.modules.homepagevthree.`data`.model.Tabbar6RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageVthreeVM : ViewModel(), KoinComponent {
  val homepageVthreeModel: MutableLiveData<HomepageVthreeModel> =
      MutableLiveData(HomepageVthreeModel())

  var navArguments: Bundle? = null

  val spinnerDeliveryaddresList: MutableLiveData<MutableList<SpinnerDeliveryaddresModel>> =
      MutableLiveData()

  val listbgThreeList: MutableLiveData<MutableList<ListbgThreeRowModel>> =
      MutableLiveData(mutableListOf())

  val tabbar2List: MutableLiveData<MutableList<Tabbar6RowModel>> = MutableLiveData(mutableListOf())
}
