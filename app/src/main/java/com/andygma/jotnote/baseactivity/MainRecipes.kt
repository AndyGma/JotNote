@file:OptIn(ExperimentalMaterial3Api::class)

package com.andygma.jotnote.baseactivity

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andygma.jotnote.R
import com.andygma.jotnote.resProject.TextJot

@Preview(showBackground = true)
@Composable
fun MainRecipes() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)) {
        DropMenuEveryDay()
        Content()
    }
}

@Composable
private fun DropMenuEveryDay() {
    val options = listOf(
        stringResource(id = R.string.dayoftheweek1),
        stringResource(id = R.string.dayoftheweek2),
        stringResource(id = R.string.dayoftheweek3),
        stringResource(id = R.string.dayoftheweek4),
        stringResource(id = R.string.dayoftheweek5),
        stringResource(id = R.string.dayoftheweek6),
        stringResource(id = R.string.dayoftheweek7),
    )

    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[0]) }
// We want to react on tap/press on TextField to show menu
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {
        TextField(
            // The `menuAnchor` modifier must be passed to the text field for correctness.
            modifier = Modifier
                .menuAnchor()
                .fillMaxWidth(),
            readOnly = true,
            value = selectedOptionText,
            onValueChange = {},
            label = { TextJot(path = R.string.label_dayoftheweek) },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(
                    containerColor = colorResource(id = R.color.colorPrimary)
                ),
            shape = RoundedCornerShape(10.dp),
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            options.forEach { selectionOption ->
                DropdownMenuItem(
                    text = { Text(selectionOption) },
                    onClick = {
                        selectedOptionText = selectionOption
                        expanded = false
                    },
                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                )
            }
        }
    }
}

@Composable
private fun Content() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .padding(top = 5.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Название блюда")
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row {
                CardJot()
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
                ) {
                    Text(text = "Добавить", modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
private fun CardJot() {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(2.dp, color = colorResource(id = R.color.colorPrimary))

    ) {
        Text(text = "Ингридиенты",
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Ingrid()
        Ingrid()
        Ingrid()
        Ingrid()
    }
}

@Composable
private fun Ingrid() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .fillMaxHeight()
                .height(30.dp)
                .padding(5.dp)
                .padding(start = 10.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            )
        ) {
            Text(text = "Ингридиенты #1",
                Modifier
                    .padding(5.dp)
            )
        }
        IconButton(

            onClick = { /* doSomething() */ }
        ) {
            Icon(Icons.Outlined.Clear, contentDescription = "Localized description", modifier = Modifier.height(20.dp))
        }
    }
}