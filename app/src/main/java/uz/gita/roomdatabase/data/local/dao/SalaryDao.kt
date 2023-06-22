package uz.gita.roomdatabase.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import uz.gita.roomdatabase.data.local.entity.Salary


@Dao
interface SalaryDao {

    @Insert
    fun insert(salary: Salary)


    @Query("SELECT * FROM Salary")
    fun getSalaries(): List<Salary>

}