package com.foodly.app.modules.addsocialaccounts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.addsocialaccounts.`data`.model.AddSocialAccountsModel
import org.koin.core.KoinComponent

class AddSocialAccountsVM : ViewModel(), KoinComponent {
  val addSocialAccountsModel: MutableLiveData<AddSocialAccountsModel> =
      MutableLiveData(AddSocialAccountsModel())

  var navArguments: Bundle? = null
}
