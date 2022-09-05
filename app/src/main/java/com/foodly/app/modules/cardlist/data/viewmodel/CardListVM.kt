package com.foodly.app.modules.cardlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.cardlist.`data`.model.CardListModel
import org.koin.core.KoinComponent

class CardListVM : ViewModel(), KoinComponent {
  val cardListModel: MutableLiveData<CardListModel> = MutableLiveData(CardListModel())

  var navArguments: Bundle? = null
}
