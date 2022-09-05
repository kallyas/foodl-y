package com.foodly.app.modules.filtersfoodtypevone1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.foodly.app.R
import com.foodly.app.appcomponents.di.MyApp
import com.foodly.app.modules.filtersfoodtypevone.ui.FiltersFoodTypeVoneFragment
import com.foodly.app.modules.pricefiltersvone.ui.PriceFiltersVoneFragment
import com.foodly.app.modules.sortbyfiltersvone.ui.SortByFiltersVoneFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class FiltersFoodTypeVone1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_type),MyApp.getInstance().resources.getString(R.string.lbl_sort_by),MyApp.getInstance().resources.getString(R.string.lbl_price),MyApp.getInstance().resources.getString(R.string.lbl_dietary))

        val viewPages: List<Fragment> =
                listOf(FiltersFoodTypeVoneFragment(),SortByFiltersVoneFragment(),PriceFiltersVoneFragment(),SortByFiltersVoneFragment())

    }
}
