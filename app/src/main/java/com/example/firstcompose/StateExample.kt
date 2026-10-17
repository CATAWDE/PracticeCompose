package com.example.firstcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun NotificationCountScreen(){
    var count: MutableState<Int> = rememberSaveable{ mutableStateOf(0) }

    Column {
        NotificationCounter(count.value, {count.value++})
        MessageBar(count.value)
    }
}
@Composable
fun MessageBar(count:Int){
Card(){
    Text(text = "Message sent so far - $count")

}
}



@Composable
fun NotificationCounter(count:Int, increment: () ->Unit){

    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have sent $count notifications")
        Button(onClick = { increment() }) {
            Text(text = "Send Notification")
        }
    }
    }
