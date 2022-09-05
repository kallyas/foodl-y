package com.foodly.app.modules.homepagevtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.homepagevtwo.`data`.model.AllRowModel
import com.foodly.app.modules.homepagevtwo.`data`.model.HomepageVtwoModel
import com.foodly.app.modules.homepagevtwo.`data`.model.SpinnerDeliveryaddresModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageVtwoVM : ViewModel(), KoinComponent {
  val homepageVtwoModel: MutableLiveData<HomepageVtwoModel> = MutableLiveData(HomepageVtwoModel())

  var navArguments: Bundle? = null

  val spinnerDeliveryaddresList: MutableLiveData<MutableList<SpinnerDeliveryaddresModel>> =
      MutableLiveData()

  val allList: MutableLiveData<MutableList<AllRowModel>> = MutableLiveData(mutableListOf())
}
