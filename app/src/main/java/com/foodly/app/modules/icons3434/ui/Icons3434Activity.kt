package com.foodly.app.modules.icons3434.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseActivity
import com.foodly.app.databinding.ActivityIcons3434Binding
import com.foodly.app.modules.icons3434.`data`.model.ListlockRowModel
import com.foodly.app.modules.icons3434.`data`.viewmodel.Icons3434VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Icons3434Activity : BaseActivity<ActivityIcons3434Binding>(R.layout.activity_icons_34_34) {
  private val viewModel: Icons3434VM by viewModels<Icons3434VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlockAdapter = ListlockAdapter(viewModel.listlockList.value?:mutableListOf())
    binding.recyclerListlock.adapter = listlockAdapter
    listlockAdapter.setOnItemClickListener(
    object : ListlockAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlockRowModel) {
        onClickRecyclerListlock(view, position, item)
      }
    }
    )
    viewModel.listlockList.observe(this) {
      listlockAdapter.updateData(it)
    }
    binding.icons3434VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListlock(
    view: View,
    position: Int,
    item: ListlockRowModel
  ): Unit {
  }

  companion object {
    const val TAG: String = "ICONS3434ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Icons3434Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
