package com.example.mobilproject2020

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Statistics :: class], version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun StatsDao() : StatsDao
}