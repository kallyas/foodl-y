package com.foodly.app.modules.refertofriends.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.refertofriends.`data`.model.ReferToFriendsModel
import org.koin.core.KoinComponent

class ReferToFriendsVM : ViewModel(), KoinComponent {
  val referToFriendsModel: MutableLiveData<ReferToFriendsModel> =
      MutableLiveData(ReferToFriendsModel())

  var navArguments: Bundle? = null
}
