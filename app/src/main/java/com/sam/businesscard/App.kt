package com.sam.businesscard

import android.app.Application
import com.sam.businesscard.data.AppDatabase
import com.sam.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}