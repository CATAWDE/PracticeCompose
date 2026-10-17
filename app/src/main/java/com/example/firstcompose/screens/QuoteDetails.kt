package com.example.firstcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcompose.R

@Preview
@Composable
fun QuoteDetail(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f)
            .background(
                Brush.sweepGradient(colors = listOf(
                Color(0xFFffffff),
                Color(0xFFE3E3E3)
            ) ))){
        Card(modifier = Modifier.padding(32.dp)){
            Column(verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp,24.dp)) {

                Image(painter = painterResource(
                    R.drawable.icon1), contentDescription = "Icon"
                )
                Text(text = "This is most valuable think")
                Spacer(Modifier.height(16.dp))
                Text(text = "Therophrastus")
            }
        }
    }
}