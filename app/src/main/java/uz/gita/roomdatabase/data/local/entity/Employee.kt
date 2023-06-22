package uz.gita.roomdatabase.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Employee(

    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val firstname: String,
    val lastname: String,
)