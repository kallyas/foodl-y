package com.foodly.app.modules.filtersvtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.filtersvtwo.`data`.model.FiltersVtwoModel
import com.foodly.app.modules.filtersvtwo.`data`.model.ListctaseconderyRowModel
import com.foodly.app.modules.filtersvtwo.`data`.model.ListdietaryRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FiltersVtwoVM : ViewModel(), KoinComponent {
  val filtersVtwoModel: MutableLiveData<FiltersVtwoModel> = MutableLiveData(FiltersVtwoModel())

  var navArguments: Bundle? = null

  val listctaseconderyList: MutableLiveData<MutableList<ListctaseconderyRowModel>> =
      MutableLiveData(mutableListOf())

  val listdietaryList: MutableLiveData<MutableList<ListdietaryRowModel>> =
      MutableLiveData(mutableListOf())
}
