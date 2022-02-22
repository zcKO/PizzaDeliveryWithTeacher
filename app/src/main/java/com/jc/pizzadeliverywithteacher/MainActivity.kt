package com.jc.pizzadeliverywithteacher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jc.pizzadeliverywithteacher.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setUpEvents()

    }

    fun setValues() {


        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter


    }

    fun setUpEvents() {

    }

}