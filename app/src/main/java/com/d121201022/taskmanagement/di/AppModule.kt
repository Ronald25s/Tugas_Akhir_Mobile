package com.d121201022.taskmanagement.di

import android.content.Context
import androidx.room.Room
import com.d121201022.taskmanagement.data.local.TaskDatabase
import com.d121201022.taskmanagement.util.Constants.TASK_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideTaskDao(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            TaskDatabase::class.java,
            TASK_DATABASE
        ).build().taskDao()
}