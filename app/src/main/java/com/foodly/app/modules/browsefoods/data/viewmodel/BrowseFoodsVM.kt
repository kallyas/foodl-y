package com.foodly.app.modules.browsefoods.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.browsefoods.`data`.model.BrowseFoodsModel
import org.koin.core.KoinComponent

class BrowseFoodsVM : ViewModel(), KoinComponent {
  val browseFoodsModel: MutableLiveData<BrowseFoodsModel> = MutableLiveData(BrowseFoodsModel())

  var navArguments: Bundle? = null
}
