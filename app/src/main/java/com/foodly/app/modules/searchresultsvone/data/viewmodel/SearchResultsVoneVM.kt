package com.foodly.app.modules.searchresultsvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.searchresultsvone.`data`.model.SearchResultsVoneModel
import org.koin.core.KoinComponent

class SearchResultsVoneVM : ViewModel(), KoinComponent {
  val searchResultsVoneModel: MutableLiveData<SearchResultsVoneModel> =
      MutableLiveData(SearchResultsVoneModel())

  var navArguments: Bundle? = null
}
