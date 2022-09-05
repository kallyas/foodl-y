package com.foodly.app.modules.typelocation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityTypeLocationBinding
import com.foodly.app.modules.typelocation.`data`.model.ListsendRowModel
import com.foodly.app.modules.typelocation.`data`.viewmodel.TypeLocationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TypeLocationActivity :
    BaseActivity<ActivityTypeLocationBinding>(R.layout.activity_type_location) {
  private val viewModel: TypeLocationVM by viewModels<TypeLocationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsendAdapter = ListsendAdapter(viewModel.listsendList.value?:mutableListOf())
    binding.recyclerListsend.adapter = listsendAdapter
    listsendAdapter.setOnItemClickListener(
    object : ListsendAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsendRowModel) {
        onClickRecyclerListsend(view, position, item)
      }
    }
    )
    viewModel.listsendList.observe(this) {
      listsendAdapter.updateData(it)
    }
    binding.typeLocationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsend(
    view: View,
    position: Int,
    item: ListsendRowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "TYPE_LOCATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TypeLocationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
