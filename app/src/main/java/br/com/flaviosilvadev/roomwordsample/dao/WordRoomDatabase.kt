package br.com.flaviosilvadev.roomwordsample.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.flaviosilvadev.roomwordsample.model.Word

@Database(entities = [Word::class], version = 1)
abstract class WordRoomDatabase : RoomDatabase() {
    abstract fun wordDao(): WordDao
}