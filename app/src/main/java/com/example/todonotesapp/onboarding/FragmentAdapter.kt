package com.example.todonotesapp.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment? {
        //0, 1
        when (position) {
            0 -> {
                return OnBoardingOneFragment()
            }
            1 -> {
                return OnBoardingTwoFragment()
            }
            else -> {
                return null
            }
        }
    }

    override fun getCount(): Int {
        return  2
    }
}