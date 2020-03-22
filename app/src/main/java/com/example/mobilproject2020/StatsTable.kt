package com.example.mobilproject2020

import androidx.room.*

@Entity(tableName = "statistics")

data class Statistics(

    @PrimaryKey(autoGenerate = true) var uid: Int?,
    @ColumnInfo(name = "time") var time: Long?,
    @ColumnInfo(name = "location") var location: String?,
    @ColumnInfo(name = "message") var message: String
)

@Dao
interface StatsDao{
    @Transaction @Insert
    fun insert(statistics: Statistics)

    @Query("SELECT * FROM statistics")
    fun getReminders(): List<Statistics>
}