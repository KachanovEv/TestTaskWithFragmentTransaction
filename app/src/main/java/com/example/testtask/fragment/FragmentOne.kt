package com.example.testtask.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testtask.R
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne : Fragment() {

    private var mCallback: OnCallbackReceived? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonOne.setOnClickListener {
            val content = editText.text.toString()
            this.mCallback!!.update(content)
        }
    }

   override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (activity is OnCallbackReceived) {
            mCallback = activity as OnCallbackReceived
        }
    }
}
