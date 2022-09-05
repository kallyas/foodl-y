package com.foodly.app.modules.yourorders1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityYourOrders1Binding
import com.foodly.app.modules.yourorders1.`data`.model.Listone1RowModel
import com.foodly.app.modules.yourorders1.`data`.viewmodel.YourOrders1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class YourOrders1Activity : BaseActivity<ActivityYourOrders1Binding>(R.layout.activity_your_orders1)
    {
  private val viewModel: YourOrders1VM by viewModels<YourOrders1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listoneAdapter = ListoneAdapter(viewModel.listoneList.value?:mutableListOf())
    binding.recyclerListone.adapter = listoneAdapter
    listoneAdapter.setOnItemClickListener(
    object : ListoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listone1RowModel) {
        onClickRecyclerListone(view, position, item)
      }
    }
    )
    viewModel.listoneList.observe(this) {
      listoneAdapter.updateData(it)
    }
    binding.yourOrders1VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListone(
    view: View,
    position: Int,
    item: Listone1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "YOUR_ORDERS1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, YourOrders1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
