package com.plcoding.stockmarketapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CompanyListingEntity::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract val dao: StockDao
}