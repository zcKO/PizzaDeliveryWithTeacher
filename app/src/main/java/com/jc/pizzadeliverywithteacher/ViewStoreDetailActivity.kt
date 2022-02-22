package com.jc.pizzadeliverywithteacher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.jc.pizzadeliverywithteacher.datas.StoreData
import kotlinx.android.synthetic.main.activity_view_store_detail.*

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

        Glide.with(this)
            .load(mStoreData.logoImageURL)
            .into(imgLogo)

        txtStoreName.text = mStoreData.name
        ratingBar.rating = mStoreData.rating.toFloat()
        txtPhoneNum.text = mStoreData.phoneNum
        txtRating.text = "(${mStoreData.rating})"

    }

    fun setUpEvents() {



    }

}