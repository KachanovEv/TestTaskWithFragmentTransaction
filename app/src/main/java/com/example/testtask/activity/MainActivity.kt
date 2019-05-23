package com.example.testtask.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.view.View
import com.example.testtask.R
import com.example.testtask.fragment.FragmentOne
import com.example.testtask.fragment.FragmentTwo
import com.example.testtask.fragment.OnCallbackReceived
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), OnCallbackReceived {

    companion object {
        var key = "text_key"
    }

    override fun update(content: String) {

            val bundle = Bundle()
            bundle.putString(key, content)

            val fragmentSecond = FragmentTwo()
            fragmentSecond.arguments = bundle
            val transactionSecond : FragmentTransaction = supportFragmentManager.beginTransaction()
            transactionSecond.replace(R.id.fl_container, fragmentSecond)
            transactionSecond.commit()
           }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonActivity.setOnClickListener(View.OnClickListener {
            val fragment = FragmentOne()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fl_container, fragment)
            transaction.commit()
        })
    }
}

