package com.example.cyrcleimage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
    fun MainScreen(){
        Column(   modifier = Modifier
            .padding(top = 15.dp)
            ) {
            Image(
                modifier = Modifier
                    .size(300.dp)
                    .clip(CircleShape)
                    .border(width = 3.dp, color = Color.Black, shape = CircleShape),



                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "Korean Girl"
            )
                Box(modifier = Modifier.padding(10.dp))
            Image(
                modifier = Modifier
                    .size(300.dp)
                    .clip(CircleShape)
                    .border(width = 3.dp, color = Color.Black, shape = CircleShape),

                painter = painterResource(id = R.drawable.img_2),
                contentDescription = "BP"
            )
        }

    }

    @Composable
    @Preview
    fun MainScreenPreview(){
        MainScreen()
    }