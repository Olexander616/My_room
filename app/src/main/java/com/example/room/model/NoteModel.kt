package com.example.room.model

import androidx.annotation.ColorLong
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity("noteTable")
class NoteModel (
    @PrimaryKey(true)
    var id :Int = 0,
    @ColumnInfo
    var title: String = "",
    @ColumnInfo
    var discription: String = ""
) : Serializable