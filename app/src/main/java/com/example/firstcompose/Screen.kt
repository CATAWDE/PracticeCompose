package com.example.firstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun previewItems(){

    /** Can create Vertiv*/
   /* Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoryList().map{ item ->
         BlogCategoryUI(  item.img, title = item.title, subtitle = item.subTitle)
        }
    }*/

    LazyColumn( content ={
        items(getCategoryList()){item ->
            BlogCategoryUI(  item.img, title = item.title, subtitle = item.subTitle)

        }
    })
}

data class Category(val img:Int, val title:String, val subTitle:String)

fun getCategoryList():List<Category>{
    val list= mutableListOf<Category>()
    list.add(Category(R.drawable.heart,"Programmig","A"))
    list.add(Category(R.drawable.heart,"Programmig","B"))
    list.add(Category(R.drawable.heart,"Programmig","C"))
    list.add(Category(R.drawable.heart,"Programmig","D"))
    list.add(Category(R.drawable.heart,"Programmig","E"))
    list.add(Category(R.drawable.heart,"Programmig","F"))
    list.add(Category(R.drawable.heart,"Programmig","G"))
    list.add(Category(R.drawable.heart,"Programmig","H"))
    list.add(Category(R.drawable.heart,"Programmig","I"))
    list.add(Category(R.drawable.heart,"Programmig","J"))
    list.add(Category(R.drawable.heart,"Programmig","K"))
    list.add(Category(R.drawable.heart,"Programmig","L"))


    return list
}

@Composable
fun BlogCategoryUI(id:Int, title:String, subtitle:String){
    Card ( modifier = Modifier.padding(8.dp)){
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)){
            Image(painter = painterResource(id),
                modifier = Modifier.size(48.dp).weight(0.2f),
                contentDescription = "Icon")

            Column {
                Text(text = title, style = MaterialTheme.typography.headlineLarge )

                Text(text = subtitle, style = MaterialTheme.typography.headlineMedium )

            }

        }
    }
}