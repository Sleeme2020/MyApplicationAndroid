package com.example.myapplication3.Auth

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.myapplication3.OnLinkFragment
import com.example.myapplication3.R

class Registration: Fragment, View.OnClickListener {

    private var mListener: OnLinkFragment? = null

    constructor():super(R.layout.registration)  {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View? = super.onCreateView(inflater, container, savedInstanceState)

        if(view!=null)
            CreateInstanseFragment(view)


        return view;
    }

    fun CreateInstanseFragment(view:View) {
        //registration click move link

        view.findViewById<Button?>(R.id.RegisterLink).setOnClickListener(this)
        view.findViewById<Button?>(R.id.LoginLink).setOnClickListener(this)
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        mListener = if (context is OnLinkFragment) {
            context as OnLinkFragment
        } else {
            throw ClassCastException(
                context.toString()
                        + " must implement MyListFragment.OnLinkFragment"
            )
        }
    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            when(p0.id) {
                R.id.RegisterLink -> {

                }
                R.id.LoginLink -> {
                    mListener?.onLinkFragment("Login")
                }
                else -> TODO("Not implementation click")
            }
        }else
        {
            TODO("View element get null")
        }
    }
}