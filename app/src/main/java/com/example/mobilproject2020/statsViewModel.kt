package com.example.mobilproject2020

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class statsViewModel(application: Application):AndroidViewModel(application) {

    private val repository: Statrepository

    val allStats: LiveData<List<Statistics>>

    init {

        val statsDao = AppDatabase.getDatabase(application).statsDao()
        repository = Statrepository(statsDao)
        allStats = repository.allStats

    }

    /**
     * Launching a new coroutine to insert the data in a non-blocking way
     */

    fun insert(statistics: Statistics) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(statistics)
    }

}