package com.eseo.lesbasesjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MyColumn(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    ) {
        Text(
            text = "Texte 1",
            color = Color.White,
            fontSize = 70.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = "Texte 2",
            color = Color.White,
            fontSize = 70.sp,
            fontWeight = FontWeight.ExtraBold
        )
    }
}

@Preview
@Composable
private fun MyColumnPreview() {
    MyColumn()
}






















