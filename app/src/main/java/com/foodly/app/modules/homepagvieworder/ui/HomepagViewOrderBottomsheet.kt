package com.foodly.app.modules.homepagvieworder.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.foodly.app.databinding.BottomsheetHomepagViewOrderBinding
import com.foodly.app.modules.homepagvieworder.`data`.model.Tabbar4RowModel
import com.foodly.app.modules.homepagvieworder.`data`.viewmodel.HomepagViewOrderVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepagViewOrderBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetHomepagViewOrderBinding>(R.layout.bottomsheet_homepag_view_order)
    {
  private val viewModel: HomepagViewOrderVM by viewModels<HomepagViewOrderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val tabbar2Adapter = Tabbar2Adapter(viewModel.tabbar2List.value?:mutableListOf())
    binding.recyclerTabbar2.adapter = tabbar2Adapter
    tabbar2Adapter.setOnItemClickListener(
    object : Tabbar2Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Tabbar4RowModel) {
        onClickRecyclerTabbar2(view, position, item)
      }
    }
    )
    viewModel.tabbar2List.observe(requireActivity()) {
      tabbar2Adapter.updateData(it)
    }
    binding.homepagViewOrderVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTabbar2(
    view: View,
    position: Int,
    item: Tabbar4RowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAG_VIEW_ORDER_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): HomepagViewOrderBottomsheet {
      val fragment = HomepagViewOrderBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
