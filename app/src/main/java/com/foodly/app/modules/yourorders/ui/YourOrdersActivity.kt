package com.foodly.app.modules.yourorders.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityYourOrdersBinding
import com.foodly.app.modules.yourorders.`data`.model.Listfood1RowModel
import com.foodly.app.modules.yourorders.`data`.model.ListfoodThree1RowModel
import com.foodly.app.modules.yourorders.`data`.model.Tabbar5RowModel
import com.foodly.app.modules.yourorders.`data`.viewmodel.YourOrdersVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class YourOrdersActivity : BaseActivity<ActivityYourOrdersBinding>(R.layout.activity_your_orders) {
  private val viewModel: YourOrdersVM by viewModels<YourOrdersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfoodAdapter = ListfoodAdapter(viewModel.listfoodList.value?:mutableListOf())
    binding.recyclerListfood.adapter = listfoodAdapter
    listfoodAdapter.setOnItemClickListener(
    object : ListfoodAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listfood1RowModel) {
        onClickRecyclerListfood(view, position, item)
      }
    }
    )
    viewModel.listfoodList.observe(this) {
      listfoodAdapter.updateData(it)
    }
    val listfoodThreeAdapter =
    ListfoodThreeAdapter(viewModel.listfoodThreeList.value?:mutableListOf())
    binding.recyclerListfoodThree.adapter = listfoodThreeAdapter
    listfoodThreeAdapter.setOnItemClickListener(
    object : ListfoodThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfoodThree1RowModel) {
        onClickRecyclerListfoodThree(view, position, item)
      }
    }
    )
    viewModel.listfoodThreeList.observe(this) {
      listfoodThreeAdapter.updateData(it)
    }
    val tabbar2Adapter = Tabbar2Adapter(viewModel.tabbar2List.value?:mutableListOf())
    binding.recyclerTabbar2.adapter = tabbar2Adapter
    tabbar2Adapter.setOnItemClickListener(
    object : Tabbar2Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tabbar5RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(this) {
      tabbar2Adapter.updateData(it)
    }
    binding.yourOrdersVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListfood(
    view: View,
    position: Int,
    item: Listfood1RowModel
  ): Unit {
  }

  fun onClickRecyclerListfoodThree(
    view: View,
    position: Int,
    item: ListfoodThree1RowModel
  ): Unit {
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar5RowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "YOUR_ORDERS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, YourOrdersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
