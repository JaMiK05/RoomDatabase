package uz.gita.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import uz.gita.roomdatabase.data.local.dataBase.AppDataBase
import uz.gita.roomdatabase.data.local.entity.Employee
import uz.gita.roomdatabase.data.local.entity.Salary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val employeeDao = AppDataBase.getInstance().getEmployeedDao()
        val salaryDao = AppDataBase.getInstance().getSalaryDao()

        employeeDao.insert(Employee(
            id = 1,
            firstname = "Olmos",
            lastname = "Davronov",
        ))

        employeeDao.insert(Employee(
            id = 2,
            firstname = "Dilmurod",
            lastname = "Khudoyberganov",
        ))

        employeeDao.insert(Employee(
            id = 3,
            firstname = "Shohjahon",
            lastname = "Omonov",
        ))

        salaryDao.insert(Salary(
            amount = 73.25,
            employee_id = 1
        ))

        salaryDao.insert(Salary(
            amount = 12.25,
            employee_id = 1
        ))

        salaryDao.insert(Salary(
            amount = 50.0,
            employee_id = 3
        ))

        Log.d("AAA", "Employees: ${employeeDao.getEmployees()}")
        Log.d("AAA", "Salaries: ${salaryDao.getSalaries()}")
        Log.d("AAA", "Employess with salaries: ${employeeDao.getEmployeeWithSalary()}")
    }
}