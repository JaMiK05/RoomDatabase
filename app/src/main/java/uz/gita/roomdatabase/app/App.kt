package uz.gita.roomdatabase.app

import android.app.Application
import uz.gita.roomdatabase.data.local.dataBase.AppDataBase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        AppDataBase.init(this)
    }

}