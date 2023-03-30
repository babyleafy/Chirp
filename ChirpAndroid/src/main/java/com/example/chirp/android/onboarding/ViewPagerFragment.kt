package com.example.chirp.android.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.chirp.android.R
import com.example.chirp.android.onboarding.screens.Onboarding1
import com.example.chirp.android.onboarding.screens.Onboarding2
import com.example.chirp.android.onboarding.screens.Onboarding3

class ViewPagerFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentList = arrayListOf<Fragment>(
            Onboarding1(),
            Onboarding2(),
            Onboarding3(),
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        viewPager?.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }
}

