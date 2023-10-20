package com.example.eletriccaapp.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.eletriccaapp.presentation.carFragment

class TabsAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {

        when (position) {
            1 -> carFragment()
            2 -> carFragment()
            else -> carFragment()
        }

        return TODO("Provide the return value")
    }
}