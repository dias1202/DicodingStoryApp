package com.dicoding.dicodingstoryapp

import com.dicoding.dicodingstoryapp.data.room.StoryEntity

object DataDummy {
    fun generateDummyStoryResponse(): List<StoryEntity> {
        val items: MutableList<StoryEntity> = arrayListOf()
        for (i in 0..100) {
            val story = StoryEntity(
                i.toString(),
                "name + $i",
                "description $i",
            )
            items.add(story)
        }
        return items
    }
}