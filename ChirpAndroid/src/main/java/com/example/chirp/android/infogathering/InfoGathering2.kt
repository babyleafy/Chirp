package com.example.chirp.android.infogathering

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.chirp.android.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [InfoGathering2.newInstance] factory method to
 * create an instance of this fragment.
 */
class InfoGathering2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_info_gathering2, container, false)
        val doneButton = view.findViewById<Button>(R.id.button_done)
        val somethingFamiliarButton = view.findViewById<Button>(R.id.button_something_familiar)
        val somethingNewButton = view.findViewById<Button>(R.id.button_something_new)
        var path = ""

        somethingFamiliarButton.setOnClickListener {
            path = "familiar"
        }
        somethingNewButton.setOnClickListener {
            path = "new"
        }

        doneButton.setOnClickListener {
            if (path == "familiar") {
                findNavController().navigate(R.id.action_infoGathering2_to_infoGathering3_1)
            } else if (path == "new") {
                findNavController().navigate(R.id.action_infoGathering2_to_infoGathering3_2)
            }
        }

        return view;    }

}