package com.andygma.jotnote.BottomMenu

import com.andygma.jotnote.R

sealed class BottomItem(var title: String, var icon: Int, var route: String) {
    object Settings : BottomItem("Settings", R.drawable.ic_settings, "settings")
    object Calendar : BottomItem("Calendar", R.drawable.ic_calendar, "calendar")
    object Note : BottomItem("Note", R.drawable.ic_note, "note")
    object Recipes : BottomItem("Recipes", R.drawable.ic_recipes, "recipes")
    object Home : BottomItem("Home", R.drawable.ic_home, "home")
}