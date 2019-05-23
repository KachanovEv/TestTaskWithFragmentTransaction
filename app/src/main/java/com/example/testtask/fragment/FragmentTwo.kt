package com.example.testtask.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testtask.R
import com.example.testtask.activity.MainActivity.Companion.key
import kotlinx.android.synthetic.main.fragment_two.*


class FragmentTwo : Fragment() {

   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       return inflater.inflate(R.layout.fragment_two, container, false)
  }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       textViewTwo.text = arguments!!.getString(key)
    }
}
