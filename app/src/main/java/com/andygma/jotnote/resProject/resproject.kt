package com.andygma.jotnote.resProject

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.andygma.jotnote.R

@Composable
fun TextJot(path : Int) {
    Text(text = stringResource(id = path),
        color = colorResource(id = R.color.white),
        fontSize = 16.sp)
}