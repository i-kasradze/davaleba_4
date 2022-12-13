package com.example.davaleba41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.davaleba41.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_home.view.*

class Home(private val binding: ActivityMainBinding, private var args: Bundle) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val btn: Button = view.findViewById(R.id.homeButton)

        btn.setOnClickListener {
            val editText: EditText = view.findViewById(R.id.homeEditText)
            val input = editText.text.toString()
            val editText2: EditText = view.homeEditText2
            val input2 = editText2.text.toString()

            args.putString("data", input)
            args.putString("data2", input2)
            binding.bottomNavigationView.selectedItemId = R.id.user

        }

        return view
    }
}