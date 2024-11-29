package com.tugas.StoryApp.di

import android.content.Context
import com.tugas.StoryApp.config.ApiConfig
import com.tugas.StoryApp.data.pref.UserPreference
import com.tugas.StoryApp.data.pref.UserRepository
import com.tugas.StoryApp.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        val apiService = ApiConfig.getApiService()
        return UserRepository.getInstance(apiService, pref)
    }
}