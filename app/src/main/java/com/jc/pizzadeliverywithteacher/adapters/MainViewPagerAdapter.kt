package com.jc.pizzadeliverywithteacher.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.jc.pizzadeliverywithteacher.fragments.MyProfileFragment
import com.jc.pizzadeliverywithteacher.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(
    fm: FragmentManager,
) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "피자 주문"
            else -> "내 정보 설정"
        }
    }

    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }

    }

}