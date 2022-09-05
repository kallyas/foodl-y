package com.foodly.app.modules.accountsettings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityAccountSettingsBinding
import com.foodly.app.modules.accountsettings.`data`.model.ListnotificationRowModel
import com.foodly.app.modules.accountsettings.`data`.model.Tabbar9RowModel
import com.foodly.app.modules.accountsettings.`data`.viewmodel.AccountSettingsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountSettingsActivity :
    BaseActivity<ActivityAccountSettingsBinding>(R.layout.activity_account_settings) {
  private val viewModel: AccountSettingsVM by viewModels<AccountSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnotificationAdapter =
    ListnotificationAdapter(viewModel.listnotificationList.value?:mutableListOf())
    binding.recyclerListnotification.adapter = listnotificationAdapter
    listnotificationAdapter.setOnItemClickListener(
    object : ListnotificationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnotificationRowModel) {
        onClickRecyclerListnotification(view, position, item)
      }
    }
    )
    viewModel.listnotificationList.observe(this) {
      listnotificationAdapter.updateData(it)
    }
    val tabbar2Adapter = Tabbar2Adapter(viewModel.tabbar2List.value?:mutableListOf())
    binding.recyclerTabbar2.adapter = tabbar2Adapter
    tabbar2Adapter.setOnItemClickListener(
    object : Tabbar2Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tabbar9RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(this) {
      tabbar2Adapter.updateData(it)
    }
    binding.accountSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListnotification(
    view: View,
    position: Int,
    item: ListnotificationRowModel
  ): Unit {
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar9RowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_SETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountSettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
