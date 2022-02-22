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
//        도전 과제에서 치킨 가게 목록 추가시 mainViewPager.offscreenLimit = 3 설정을 해주어야 정상 동작.
        mainTabLayout.setupWithViewPager(mainViewPager)

    }

    fun setUpEvents() {

    }

}