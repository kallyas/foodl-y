package com.foodly.app.modules.homepagvieworder.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.homepagvieworder.`data`.model.HomepagViewOrderModel
import com.foodly.app.modules.homepagvieworder.`data`.model.Tabbar4RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepagViewOrderVM : ViewModel(), KoinComponent {
  val homepagViewOrderModel: MutableLiveData<HomepagViewOrderModel> =
      MutableLiveData(HomepagViewOrderModel())

  var navArguments: Bundle? = null

  val tabbar2List: MutableLiveData<MutableList<Tabbar4RowModel>> = MutableLiveData(mutableListOf())
}
