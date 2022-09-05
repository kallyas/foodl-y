package com.foodly.app.modules.searchresultsvtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.searchresultsvtwo.`data`.model.SearchResultsVtwoModel
import com.foodly.app.modules.searchresultsvtwo.`data`.model.SearchresultRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultsVtwoVM : ViewModel(), KoinComponent {
  val searchResultsVtwoModel: MutableLiveData<SearchResultsVtwoModel> =
      MutableLiveData(SearchResultsVtwoModel())

  var navArguments: Bundle? = null

  val searchresultList: MutableLiveData<MutableList<SearchresultRowModel>> =
      MutableLiveData(mutableListOf())
}
