package com.example.myapplication

import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_follow.*
import kotlinx.android.synthetic.main.fragment_positive.*
import java.util.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentLayoutContainer, FollowFragment())
                .commit()
        }

    }


    fun openFollowFragment(view: View) {


            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentLayoutContainer, FollowFragment())
                .commit()

    }

    fun openPositiveFragment(view: View) {



            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentLayoutContainer, PositiveFragment())
                .commit()


    }



}