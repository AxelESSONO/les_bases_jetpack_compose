package com.eseo.lesbasesjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.eseo.lesbasesjetpackcompose.ui.theme.Purple40

@Preview
@Composable
fun MyConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(Purple40)
    ) {

        val(box1, box2) = createRefs()

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color = Color.Red)
                .constrainAs(box1) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color = Color.Magenta)
        )

    }
}