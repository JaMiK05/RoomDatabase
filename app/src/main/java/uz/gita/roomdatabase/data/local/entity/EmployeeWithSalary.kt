package uz.gita.roomdatabase.data.local.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation


@Entity
class EmployeeWithSalary(

    @Embedded
    val employee: Employee,
    @Relation(
        parentColumn = "id",
        entityColumn = "employee_id"
    )
    val salary: Salary?,
)