package com.example.mymvvmtest

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_two.*

class Fragment2 : BaseFragment() {
    override val resLayout: Int
        get() = R.layout.fragment_two

    override fun onCreateView(view: View) {

    }

    companion object {
        val TAG = Fragment2::class.java.name
    }

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProviders.of(activity!!).get(MainViewModel::class.java)

        mainViewModel.getstatus().observe(this, Observer {
            Log.d("Observer", "called "+ it.toString())
        })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_fragment_two.setOnClickListener {
            mainViewModel.addStatus()
        }
    }

}