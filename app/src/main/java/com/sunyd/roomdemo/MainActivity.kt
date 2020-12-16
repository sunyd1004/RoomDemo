package com.sunyd.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val database by lazy {
        ContactsDataBase.getInstance(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.insert).setOnClickListener {
            val contactsModel = ContactsModel(System.currentTimeMillis(), "sunyd", "123456")
            database.contactsDao().insert(contactsModel)
        }
    }
}