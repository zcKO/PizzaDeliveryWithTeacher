package com.jc.pizzadeliverywithteacher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jc.pizzadeliverywithteacher.datas.StoreData

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var mStoreData: StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        mStoreData = intent.getSerializableExtra("store") as StoreData

        setValues()
        setUpEvents()

    }

    fun setValues() {

    }

    fun setUpEvents() {

    }

}