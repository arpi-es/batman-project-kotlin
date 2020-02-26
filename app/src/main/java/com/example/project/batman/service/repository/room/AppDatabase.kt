package com.example.project.batman.service.repository.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.project.batman.service.model.Search
import kotlinx.coroutines.CoroutineScope


@Database(entities = [Search::class],
        version = 1, exportSchema = false)


abstract class AppDatabase : RoomDatabase() {

    abstract fun searchDao(): SearchDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): AppDatabase {
            return INSTANCE
                    ?: synchronized(this) {
                        val instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "db-main")
                                .build()
                        INSTANCE = instance
                        instance
                    }
        }

    }

}
