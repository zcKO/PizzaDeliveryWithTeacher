package com.jc.pizzadeliverywithteacher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        setValues()
        setUpEvents()

    }

    fun setValues() {

    }

    fun setUpEvents() {

        btnSave.setOnClickListener {

            val inputNickname = edtNickname.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)
            setResult(RESULT_OK, resultIntent)
            finish()
        }

    }

}