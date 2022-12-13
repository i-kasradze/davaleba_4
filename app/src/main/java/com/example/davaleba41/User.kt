package com.example.davaleba41
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.davaleba41.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_user.view.*

class User(private val binding: ActivityMainBinding, private var args: Bundle) : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user, container, false)

        val textView: TextView = view.findViewById(R.id.userTextView)
        val textView2: TextView = view.userTextView2
        val btn: Button = view.userButton

        val inputData = args.get("data")
        textView.text = inputData.toString()

        val inputData2 = args.get("data2")
        textView2.text = inputData2.toString()

        btn.setOnClickListener{
            val editText:EditText = view.userEditText
            val input = editText.text.toString()
            args.putString("contactData", input)
            binding.bottomNavigationView.selectedItemId = R.id.contacts

        }

        return view
    }



}