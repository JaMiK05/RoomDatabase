package uz.gita.roomdatabase.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(foreignKeys = [ForeignKey(
    entity = Employee::class,
    parentColumns = ["id"],
    childColumns = ["employee_id"],
    onDelete = ForeignKey.CASCADE,
    onUpdate = ForeignKey.CASCADE
)])
class Salary(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val amount: Double,
    val employee_id: Long,
)