package com.foodly.app.modules.homepagevfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.homepagevfour.`data`.model.HomepageVfourModel
import com.foodly.app.modules.homepagevfour.`data`.model.SpinnerDeliveryaddresModel
import com.foodly.app.modules.homepagevfour.`data`.model.StaggeredbgThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageVfourVM : ViewModel(), KoinComponent {
  val homepageVfourModel: MutableLiveData<HomepageVfourModel> =
      MutableLiveData(HomepageVfourModel())

  var navArguments: Bundle? = null

  val spinnerDeliveryaddresList: MutableLiveData<MutableList<SpinnerDeliveryaddresModel>> =
      MutableLiveData()

  val staggeredbgThreeList: MutableLiveData<MutableList<StaggeredbgThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
