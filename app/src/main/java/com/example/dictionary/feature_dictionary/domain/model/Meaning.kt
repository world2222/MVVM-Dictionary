package com.example.dictionary.feature_dictionary.domain.model

import com.example.dictionary.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
