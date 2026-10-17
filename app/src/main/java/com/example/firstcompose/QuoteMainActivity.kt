package com.example.firstcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.firstcompose.screens.QuoteDetail


/**
 * 1. Quote Listing Page (QuoteMainActivity class)
 *    Quote list item (QuoteListItem composable)
 * 2.Onclick QuoteList Item opens -Quote detail page (QuoteDetails composable)
 * 3. assets - json file
 *
 * ***/
class QuoteMainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
           QuoteDetail()
        }
    }

}