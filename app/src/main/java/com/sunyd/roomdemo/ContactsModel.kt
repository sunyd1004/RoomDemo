package com.sunyd.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "contacts_model")
data class ContactsModel(
        @PrimaryKey
        @ColumnInfo(name = "contacts_id")
        val id: Long,
        @ColumnInfo(name = "name")
        val name: String,
        @ColumnInfo(name = "phone")
        val phone: String
): Serializable