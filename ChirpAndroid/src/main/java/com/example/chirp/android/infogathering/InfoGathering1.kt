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

class InfoGathering1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_info_gathering1, container, false)
        val doneButton = view.findViewById<Button>(R.id.button_done)
        val firstName = view.findViewById<EditText>(R.id.editText_first_name)
        val lastName = view.findViewById<EditText>(R.id.editText_last_name)
        val phone = view.findViewById<EditText>(R.id.editText_phone)
        val phoneRegex = "^(\\d{3}-){2}\\d{4}\$".toRegex()

        doneButton.setOnClickListener {
            if (firstName.text.toString().isNotBlank() &&
                lastName.text.toString().isNotBlank() &&
                phone.text.toString().isNotBlank() &&
                phoneRegex.matches(phone.text.toString())) {
                findNavController().navigate(R.id.action_infoGathering_to_infoGathering2)
            }
        }

        return view;
    }
}