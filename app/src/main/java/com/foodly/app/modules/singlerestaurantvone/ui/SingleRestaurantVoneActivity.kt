package com.foodly.app.modules.singlerestaurantvone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivitySingleRestaurantVoneBinding
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListbgRowModel
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfireRowModel
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfoodRowModel
import com.foodly.app.modules.singlerestaurantvone.`data`.model.ListfoodThreeRowModel
import com.foodly.app.modules.singlerestaurantvone.`data`.viewmodel.SingleRestaurantVoneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SingleRestaurantVoneActivity :
    BaseActivity<ActivitySingleRestaurantVoneBinding>(R.layout.activity_single_restaurant_vone) {
  private val viewModel: SingleRestaurantVoneVM by viewModels<SingleRestaurantVoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfireAdapter = ListfireAdapter(viewModel.listfireList.value?:mutableListOf())
    binding.recyclerListfire.adapter = listfireAdapter
    listfireAdapter.setOnItemClickListener(
    object : ListfireAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfireRowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListbgRowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListfoodRowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListfoodThreeRowModel) {
        onClickRecyclerListfoodThree(view, position, item)
      }
    }
    )
    viewModel.listfoodThreeList.observe(this) {
      listfoodThreeAdapter.updateData(it)
    }
    binding.singleRestaurantVoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListfire(
    view: View,
    position: Int,
    item: ListfireRowModel
  ): Unit {
  }

  fun onClickRecyclerListbg(
    view: View,
    position: Int,
    item: ListbgRowModel
  ): Unit {
  }

  fun onClickRecyclerListfood(
    view: View,
    position: Int,
    item: ListfoodRowModel
  ): Unit {
  }

  fun onClickRecyclerListfoodThree(
    view: View,
    position: Int,
    item: ListfoodThreeRowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "SINGLE_RESTAURANT_VONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SingleRestaurantVoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
