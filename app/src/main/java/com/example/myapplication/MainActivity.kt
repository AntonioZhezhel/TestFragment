package com.example.myapplication

import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    private val rnd = Random()
    private val colorFollow = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
    private val colorPositive = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkOrientations()
    }

    fun openFollowFragment(view: View) {
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentLayoutContainer)

        if (fragment == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentLayoutContainer, FollowFragment())
                .commit()
        }else{
            Toast.makeText(applicationContext, "Fragment Follow is active",Toast.LENGTH_LONG).show()
        }

    }

    fun openPositiveFragment(view: View) {
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentLayoutContainer)

        if (fragment == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentLayoutContainer, PositiveFragment())
                .commit()
        }else{
            Toast.makeText(applicationContext, "Fragment Positive is active",Toast.LENGTH_LONG).show()
        }

    }

    fun checkOrientations() {
        val orientation = this.resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            buttonFollow.setTextColor(colorFollow)
            buttonPositive.setTextColor(colorPositive)
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            buttonFollow.setTextColor(colorFollow)
            buttonPositive.setTextColor(colorPositive)
        }
    }

    override fun onBackPressed() {
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentLayoutContainer)

        if (fragment != null){
            supportFragmentManager.beginTransaction().remove(fragment).commit()
        }else{
            finishAffinity()

        }
    }



}