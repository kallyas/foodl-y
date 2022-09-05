package com.foodly.app.modules.pricefiltersvone.ui

import androidx.fragment.app.viewModels
import com.foodly.app.R
import com.foodly.app.appcomponents.base.BaseFragment
import com.foodly.app.databinding.FragmentPriceFiltersVoneBinding
import com.foodly.app.modules.pricefiltersvone.`data`.viewmodel.PriceFiltersVoneVM
import kotlin.String

class PriceFiltersVoneFragment :
        BaseFragment<FragmentPriceFiltersVoneBinding>(R.layout.fragment_price_filters_vone) {
    private val viewModel: PriceFiltersVoneVM by viewModels<PriceFiltersVoneVM>()

    override fun onInitialized() {
        viewModel.navArguments = arguments
        binding.priceFiltersVoneVM = viewModel
    }

    override fun setUpClicks() {
    }

    companion object {
        const val TAG: String = "PRICE_FILTERS_VONE_FRAGMENT"
    }
}
