package com.example.chirp.android.infogathering

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.chirp.android.R

/**
 * A simple [Fragment] subclass.
 * Use the [InfoGathering3_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class InfoGathering3_1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_info_gathering3_1, container, false)
        val doneButton = view.findViewById<Button>(R.id.button_done)

        doneButton.setOnClickListener {
            findNavController().navigate(R.id.action_infoGathering3_1_to_homeScreen)
        }

        return view;
    }


}