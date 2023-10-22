package com.example.myapplication3.work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication3.R

class fragment_profile : Fragment {

    /*companion object {
        fun newInstance() = fragment_profile()
    }*/

  //  private lateinit var viewModel: FragmentProfileViewModel
  constructor():super(R.layout.fragment_fragment_profile)  {

  }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View? = super.onCreateView(inflater, container, savedInstanceState)
        return view
    }



   /* override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

}