package com.jc.pizzadeliverywithteacher.datas

import java.io.Serializable

class StoreData(
    val name: String,
    val rating: Double,
    val phoneNum: String,
    val logoImageURL: String
) : Serializable {
}