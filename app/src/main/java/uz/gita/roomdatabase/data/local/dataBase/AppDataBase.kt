package uz.gita.roomdatabase.data.local.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import uz.gita.roomdatabase.data.local.dao.EmployeeDao
import uz.gita.roomdatabase.data.local.dao.SalaryDao
import uz.gita.roomdatabase.data.local.entity.Employee
import uz.gita.roomdatabase.data.local.entity.Salary

@Database(entities = [Employee::class, Salary::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    abstract fun getEmployeedDao(): EmployeeDao
    abstract fun getSalaryDao(): SalaryDao

    companion object {
        private lateinit var instance: AppDataBase

        fun init(context: Context) {
            if (!(::instance.isInitialized)) {
                instance = Room.databaseBuilder(
                    context,
                    AppDataBase::class.java,
                    "mySuperUltraProDatabase.db"
                )
                    .allowMainThreadQueries().build()
            }
        }

        fun getInstance() = instance
    }


}