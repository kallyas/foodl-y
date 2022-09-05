package com.foodly.app.modules.sharelinkpopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.foodly.app.modules.sharelinkpopup.`data`.model.ShareLinkPopupModel
import org.koin.core.KoinComponent

class ShareLinkPopupVM : ViewModel(), KoinComponent {
  val shareLinkPopupModel: MutableLiveData<ShareLinkPopupModel> =
      MutableLiveData(ShareLinkPopupModel())

  var navArguments: Bundle? = null
}
