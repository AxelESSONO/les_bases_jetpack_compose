package com.eseo.lesbasesjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.eseo.lesbasesjetpackcompose.ui.theme.Purple40
import com.eseo.lesbasesjetpackcompose.ui.theme.PurpleGrey40

@Preview
@Composable
fun MyBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Red,
                        Color.Blue,
                        Color.Yellow
                    )
                )
            )
    ) {
        // Body
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = Color.Green)
            .align(Alignment.Center)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = Color.Red)
            .align(Alignment.BottomEnd)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = Color.Blue)
            .align(Alignment.TopStart)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(
                color = Color.Black,
                shape = RoundedCornerShape(50.dp)
            )
            .align(Alignment.TopCenter)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = Color.Yellow)
            .align(Alignment.BottomCenter)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = Color.Magenta)
            .align(Alignment.CenterEnd)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = Color.White)
            .align(Alignment.CenterStart)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = Color.Cyan)
            .align(Alignment.BottomStart)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = PurpleGrey40)
            .align(Alignment.TopEnd)
        )
        Box(modifier = Modifier
            .fillMaxWidth(0.3f)
            .fillMaxHeight(0.3f)
            .background(color = Purple40)
        )
    }
}









































