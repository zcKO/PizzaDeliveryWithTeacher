package com.jc.pizzadeliverywithteacher.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.jc.pizzadeliverywithteacher.datas.StoreData

class StoreAdapter(
    val mContext: Context,
    resId: Int,
    val storeList: ArrayList<StoreData>
): ArrayAdapter<StoreData>(mContext, resId, storeList) {

}