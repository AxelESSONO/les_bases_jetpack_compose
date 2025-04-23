package com.eseo.lesbasesjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.eseo.lesbasesjetpackcompose.ui.theme.PurpleGrey40

@Preview
@Composable
fun MyRow(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxSize()
            .background(color = PurpleGrey40)
    ) {
        Text(
            text = "Texte 1",
            fontSize = 30.sp,
            color = Color.White
        )
        Text(
            text = "Texte 2",
            fontSize = 30.sp,
            color = Color.White
        )
        Text(
            text = "Texte 3",
            fontSize = 30.sp,
            color = Color.White
        )
    }
}