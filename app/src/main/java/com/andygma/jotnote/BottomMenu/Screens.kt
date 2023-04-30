package com.andygma.jotnote.BottomMenu

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Screen1() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Settings",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen2() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Calendar",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen3() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Note",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen4() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Recipes",
        textAlign = TextAlign.Center
    )
}

@Composable
fun Screen5() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Home",
        textAlign = TextAlign.Center
    )
}