package com.example.dictionary.feature_dictionary.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.dictionary.feature_dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {

    @Upsert
    suspend fun insertWordInfos(infos: List<WordInfoEntity>)

    @Query("DELETE FROM wordinfoentity WHERE word IN(:words)")
    suspend fun deleteWordInfos(words: List<String>)

    @Query("SELECT * FROM wordinfoentity WHERE word LIKE '%' || :word || '%'")  // means like '***(:word)***', just any words including (:word)
    suspend fun getWordInfos(word: String): List<WordInfoEntity>
}