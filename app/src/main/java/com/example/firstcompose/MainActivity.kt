package com.example.firstcompose


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Text(text = "Hello World")
            TextInput()
        }
    }
}




















/* Preview function distinguish with names
* showBackground- white color, name systemUi- how ur composable will be visible on ui, give width height
* either give default value or use named arguments like SayCheesy2 */
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, name ="First", showSystemUi = true, widthDp = 200, heightDp = 200)
@Composable
fun SayCheesy(name:String="Cheezycode"){

    Column(modifier = Modifier.fillMaxSize()) {
        
        Text(text = "Preview Hello $name",
            modifier = Modifier.background(Color.Blue).padding(10.dp).size(200.dp, 200.dp)
                .border(width = 4.dp, color = Color.Red).clip(CircleShape).background(Color.Yellow)
            ,color=Color.White,
            )

        Image(painter = painterResource(R.drawable.bg_doctor_call_missed_2), contentDescription = "Dummy image")
        Button(onClick = {}, enabled = false) {
            Text(text = "Button")
        }

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextInput(){
    val state = remember {  mutableStateOf("")}
    TextField(
        value = state.value,
        onValueChange ={
            state.value= it
        },
        label = { Text(text = "Enter Message") })
}


@Composable
fun callListView(imgId:Int, title:String, subtitle:String){
    Row (modifier = Modifier.padding(10.dp).height(50.dp)){
        Image(painter = painterResource(imgId), contentDescription = "Dummy image")
        Column{
            Text(text =title, fontStyle = FontStyle.Italic, fontSize = 14.sp, color = Color.Blue)
            Text(text = subtitle, fontStyle = FontStyle.Normal, fontSize = 12.sp, color = Color.Blue)

        }
    }
}