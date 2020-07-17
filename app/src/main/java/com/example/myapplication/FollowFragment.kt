package com.example.myapplication

import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_follow.*
import java.util.*

class FollowFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_follow, container, false)
    }
    private val rnd = Random()
    private val colorFollow = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkOrientations()

    }


    fun checkOrientations() {
        val orientation = this.resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            buttonFollow.setTextColor(colorFollow)
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            buttonFollow.setTextColor(colorFollow)
        }
    }


}