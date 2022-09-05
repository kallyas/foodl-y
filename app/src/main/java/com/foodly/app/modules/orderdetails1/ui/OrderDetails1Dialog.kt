package com.foodly.app.modules.orderdetails1.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseDialogFragment
import com.foodly.app.databinding.DialogOrderDetails1Binding
import com.foodly.app.modules.orderdetails1.`data`.viewmodel.OrderDetails1VM
import kotlin.String
import kotlin.Unit

class OrderDetails1Dialog :
    BaseDialogFragment<DialogOrderDetails1Binding>(R.layout.dialog_order_details1) {
  private val viewModel: OrderDetails1VM by viewModels<OrderDetails1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.orderDetails1VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ORDER_DETAILS1DIALOG"


    fun getInstance(bundle: Bundle?): OrderDetails1Dialog {
      val fragment = OrderDetails1Dialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
