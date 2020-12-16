package com.sunyd.roomdemo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(ContactsModel::class), version = 1)
abstract class ContactsDataBase : RoomDatabase() {

    abstract fun contactsDao(): ContactsDao

    companion object {
        private var instance: ContactsDataBase? = null
        fun getInstance(context: Context): ContactsDataBase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    ContactsDataBase::class.java,
                    "contacts.db"
                ).fallbackToDestructiveMigration().build()
            }
            return instance as ContactsDataBase
        }
    }
}