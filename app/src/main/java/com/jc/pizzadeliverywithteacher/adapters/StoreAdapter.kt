package com.jc.pizzadeliverywithteacher.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.jc.pizzadeliverywithteacher.R
import com.jc.pizzadeliverywithteacher.datas.StoreData
import com.willy.ratingbar.ScaleRatingBar

class StoreAdapter(
    val mContext: Context,
    resId: Int,
    val mStoreList: ArrayList<StoreData>
): ArrayAdapter<StoreData>(mContext, resId, mStoreList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!
        val data = mStoreList[position]
        val imgLogo = row.findViewById<ImageView>(R.id.imgLogo)
        val txtStoreName = row.findViewById<TextView>(R.id.txtStoreName)
        val ratingBar = row.findViewById<ScaleRatingBar>(R.id.ratingBar)

        txtStoreName.text = data.name

        Glide.with(mContext)
            .load(data.logoImageURL)
            .into(imgLogo)

        ratingBar.rating = data.rating.toFloat()

        return row
    }

}