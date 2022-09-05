package com.foodly.app.modules.icons2424.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityIcons2424Binding
import com.foodly.app.modules.icons2424.`data`.model.ListfolderRowModel
import com.foodly.app.modules.icons2424.`data`.viewmodel.Icons2424VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Icons2424Activity : BaseActivity<ActivityIcons2424Binding>(R.layout.activity_icons_24_24) {
  private val viewModel: Icons2424VM by viewModels<Icons2424VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfolderAdapter = ListfolderAdapter(viewModel.listfolderList.value?:mutableListOf())
    binding.recyclerListfolder.adapter = listfolderAdapter
    listfolderAdapter.setOnItemClickListener(
    object : ListfolderAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfolderRowModel) {
        onClickRecyclerListfolder(view, position, item)
      }
    }
    )
    viewModel.listfolderList.observe(this) {
      listfolderAdapter.updateData(it)
    }
    binding.icons2424VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListfolder(
    view: View,
    position: Int,
    item: ListfolderRowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "ICONS2424ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Icons2424Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
