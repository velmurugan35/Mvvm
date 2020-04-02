package com.example.mymvvmtest

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_one.*

class Fragment1 : BaseFragment() {

    companion object {
        val TAG = Fragment1::class.java.name
    }

    override val resLayout: Int
        get() = R.layout.fragment_one

    override fun onCreateView(view: View) {
        dataViewModel = ViewModelProviders.of(activity!!).get(MainViewModel::class.java)

    }

    lateinit var dataViewModel: MainViewModel
    lateinit var mainActivity: MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mainActivity = activity as MainActivity
        btn_fragment_1.setOnClickListener {
            //dataViewModel.updateMainStatus()
            //dataViewModel.addStatus()
            mainActivity.replaceFragment(Fragment2(),Fragment2.TAG, true)
        }
    }


}