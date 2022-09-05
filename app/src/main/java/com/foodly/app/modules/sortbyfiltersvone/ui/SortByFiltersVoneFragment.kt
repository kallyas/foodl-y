package com.foodly.app.modules.sortbyfiltersvone.ui

import androidx.fragment.app.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseFragment
import com.foodly.app.databinding.FragmentSortByFiltersVoneBinding
import com.foodly.app.modules.sortbyfiltersvone.`data`.viewmodel.SortByFiltersVoneVM
import kotlin.String

class SortByFiltersVoneFragment :
        BaseFragment<FragmentSortByFiltersVoneBinding>(R.layout.fragment_sort_by_filters_vone) {
    private val viewModel: SortByFiltersVoneVM by viewModels<SortByFiltersVoneVM>()

    override fun onInitialized() {
        viewModel.navArguments = arguments
        binding.sortByFiltersVoneVM = viewModel
    }

    override fun setUpClicks() {
    }

    companion object {
        const val TAG: String = "SORT_BY_FILTERS_VONE_FRAGMENT"
    }
}
