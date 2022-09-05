package com.foodly.app.modules.singlerestaurantvtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySingleRestaurantVtwoBinding
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listbg2RowModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listfire1RowModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.Listfood2RowModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.model.ListfoodThree2RowModel
import com.foodly.app.modules.singlerestaurantvtwo.`data`.viewmodel.SingleRestaurantVtwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SingleRestaurantVtwoActivity :
    BaseActivity<ActivitySingleRestaurantVtwoBinding>(R.layout.activity_single_restaurant_vtwo) {
  private val viewModel: SingleRestaurantVtwoVM by viewModels<SingleRestaurantVtwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfireAdapter = ListfireAdapter(viewModel.listfireList.value?:mutableListOf())
    binding.recyclerListfire.adapter = listfireAdapter
    listfireAdapter.setOnItemClickListener(
    object : ListfireAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listfire1RowModel) {
        onClickRecyclerListfire(view, position, item)
      }
    }
    )
    viewModel.listfireList.observe(this) {
      listfireAdapter.updateData(it)
    }
    val listbgAdapter = ListbgAdapter(viewModel.listbgList.value?:mutableListOf())
    binding.recyclerListbg.adapter = listbgAdapter
    listbgAdapter.setOnItemClickListener(
    object : ListbgAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbg2RowModel) {
        onClickRecyclerListbg(view, position, item)
      }
    }
    )
    viewModel.listbgList.observe(this) {
      listbgAdapter.updateData(it)
    }
    val listfoodAdapter = ListfoodAdapter(viewModel.listfoodList.value?:mutableListOf())
    binding.recyclerListfood.adapter = listfoodAdapter
    listfoodAdapter.setOnItemClickListener(
    object : ListfoodAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listfood2RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListfoodThree2RowModel) {
        onClickRecyclerListfoodThree(view, position, item)
      }
    }
    )
    viewModel.listfoodThreeList.observe(this) {
      listfoodThreeAdapter.updateData(it)
    }
    binding.singleRestaurantVtwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListfire(
    view: View,
    position: Int,
    item: Listfire1RowModel
  ): Unit {
  }

  fun onClickRecyclerListbg(
    view: View,
    position: Int,
    item: Listbg2RowModel
  ): Unit {
  }

  fun onClickRecyclerListfood(
    view: View,
    position: Int,
    item: Listfood2RowModel
  ): Unit {
  }

  fun onClickRecyclerListfoodThree(
    view: View,
    position: Int,
    item: ListfoodThree2RowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "SINGLE_RESTAURANT_VTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SingleRestaurantVtwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
