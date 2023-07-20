package com.example.dictionary.feature_dictionary.data.util

import java.lang.reflect.Type
// List of the functions
interface JsonParser {
    fun <T> fromJson(json: String, type: Type): T?

    fun <T> toJson(obj: T, type: Type): String?
}