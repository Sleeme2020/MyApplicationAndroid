package com.example.myapplication3.work

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication3.work.VM.FragmentProfileViewModel
import com.example.myapplication3.R

class fragment_profile : Fragment() {

    /*companion object {
        fun newInstance() = fragment_profile()
    }*/

  //  private lateinit var viewModel: FragmentProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_profile, container, false)
    }

   /* override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}