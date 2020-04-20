package com.example.mobilproject2020

import androidx.lifecycle.LiveData

class Statrepository(private val statsDao:StatsDao) {

    val allStats: LiveData<List<Statistics>> = statsDao.getStats()

    suspend fun insert(statistics: Statistics){

        statsDao.insert(statistics)
    }
}