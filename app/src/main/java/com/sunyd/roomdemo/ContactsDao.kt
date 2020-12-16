package com.sunyd.roomdemo

import androidx.room.*

@Dao
interface ContactsDao {

    @Insert
    fun insert(contactsModel: ContactsModel)

    @Delete
    fun deleteById(contactsModel: ContactsModel)

    @Query("delete from contacts_model where contacts_id = :id")
    fun deleteById(id: Long)

    @Query("delete from contacts_model")
    fun deleteAll()

    @Update
    fun updateById(contactsModel: ContactsModel)

    @Query("update contacts_model set name = :name and phone = :phone where contacts_id = :id")
    fun updateById(name: String, phone: String, id: Long)

    @Query("select * from contacts_model where contacts_id = :id")
    fun queryById(id: Long): ContactsModel

    @Query("select * from contacts_model")
    fun queryAll(): List<ContactsModel>
}