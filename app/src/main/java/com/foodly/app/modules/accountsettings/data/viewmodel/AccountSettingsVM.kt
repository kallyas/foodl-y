package com.foodly.app.modules.accountsettings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.accountsettings.`data`.model.AccountSettingsModel
import com.foodly.app.modules.accountsettings.`data`.model.ListnotificationRowModel
import com.foodly.app.modules.accountsettings.`data`.model.Tabbar9RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccountSettingsVM : ViewModel(), KoinComponent {
  val accountSettingsModel: MutableLiveData<AccountSettingsModel> =
      MutableLiveData(AccountSettingsModel())

  var navArguments: Bundle? = null

  val listnotificationList: MutableLiveData<MutableList<ListnotificationRowModel>> =
      MutableLiveData(mutableListOf())

  val tabbar2List: MutableLiveData<MutableList<Tabbar9RowModel>> = MutableLiveData(mutableListOf())
}
