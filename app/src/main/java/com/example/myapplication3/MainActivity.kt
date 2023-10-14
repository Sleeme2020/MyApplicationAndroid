package com.example.myapplication3



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.myapplication3.Auth.LoginFragment
import com.example.myapplication3.Auth.Registration


class MainActivity : AppCompatActivity(), OnLinkFragment {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

    }

    override fun onLinkFragment(link: String?) {
        when(link) {

            "Register"-> supportFragmentManager.commit {
                replace<Registration>(R.id.Auth_view_fragment)
                setReorderingAllowed(true)
            }

            "Login"-> supportFragmentManager.commit {
                replace<LoginFragment>(R.id.Auth_view_fragment)
                setReorderingAllowed(true)
            }
            else -> {TODO("Not implementation click")}
        }


    }


}