package com.example.chirp.android.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.chirp.android.R

class Onboarding3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_onboarding3, container, false)
        val finishButton = view.findViewById<Button>(R.id.finish)

        finishButton.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_infoGathering)
            onBoardingFinished()
        }

        return view;
    }

    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("Onboarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }
}