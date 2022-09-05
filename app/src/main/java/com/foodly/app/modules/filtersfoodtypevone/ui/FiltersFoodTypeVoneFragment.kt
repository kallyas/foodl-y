package com.foodly.app.modules.filtersfoodtypevone.ui

import androidx.fragment.app.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseFragment
import com.foodly.app.databinding.FragmentFiltersFoodTypeVoneBinding
import com.foodly.app.modules.filtersfoodtypevone.`data`.viewmodel.FiltersFoodTypeVoneVM
import kotlin.String
import kotlin.Unit

class FiltersFoodTypeVoneFragment :
    BaseFragment<FragmentFiltersFoodTypeVoneBinding>(R.layout.fragment_filters_food_type_vone) {
  private val viewModel: FiltersFoodTypeVoneVM by viewModels<FiltersFoodTypeVoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.filtersFoodTypeVoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FILTERS_FOOD_TYPE_VONE_FRAGMENT"

  }
}
