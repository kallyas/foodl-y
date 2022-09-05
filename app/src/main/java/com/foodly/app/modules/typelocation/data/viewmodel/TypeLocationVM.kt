package com.foodly.app.modules.typelocation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.typelocation.`data`.model.ListsendRowModel
import com.foodly.app.modules.typelocation.`data`.model.TypeLocationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TypeLocationVM : ViewModel(), KoinComponent {
  val typeLocationModel: MutableLiveData<TypeLocationModel> = MutableLiveData(TypeLocationModel())

  var navArguments: Bundle? = null

  val listsendList: MutableLiveData<MutableList<ListsendRowModel>> =
      MutableLiveData(mutableListOf())
}
