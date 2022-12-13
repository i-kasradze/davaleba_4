package com.example.davaleba41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.davaleba41.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_contacts.*
import kotlinx.android.synthetic.main.fragment_contacts.view.*

class Contacts(private var args: Bundle) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_contacts, container, false)
        val inputData = args.get("contactData")
        val contactsTextView = view.contactsTextView

        contactsTextView.text = inputData.toString()


        return view
    }


}