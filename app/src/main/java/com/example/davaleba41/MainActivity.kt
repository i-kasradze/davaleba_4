package com.example.davaleba41
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.davaleba41.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var args: Bundle = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        actionBar?.hide()

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home(binding, args))

        binding.bottomNavigationView.setOnItemSelectedListener {

            setBottomNav(it.itemId, args)
        }

    }

    private fun setBottomNav(id: Int, args: Bundle): Boolean {
        when(id){

            R.id.home -> replaceFragment(Home(binding, args))
            R.id.user -> replaceFragment(User(binding, args))
            R.id.contacts -> replaceFragment(Contacts(args))

            else ->{

            }
        }
        return true
    }


    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()

    }
}