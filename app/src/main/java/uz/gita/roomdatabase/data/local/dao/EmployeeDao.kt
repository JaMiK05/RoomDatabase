package uz.gita.roomdatabase.data.local.dao

import androidx.room.*
import uz.gita.roomdatabase.data.local.entity.Employee
import uz.gita.roomdatabase.data.local.entity.EmployeeWithSalary


@Dao
interface EmployeeDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertMultiple(vararg employee: Employee)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(employee: Employee)

    @Query("SELECT * FROM Employee")
    fun getEmployees(): List<Employee>

    @Query("SELECT * FROM Employee")
    fun getEmployeeWithSalary(): List<EmployeeWithSalary>

}