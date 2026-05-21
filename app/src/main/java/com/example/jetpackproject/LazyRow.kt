package com.example.jetpackproject

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyRow(modifier: Modifier = Modifier) {

    LazyRow(Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically){
        items(50){
            Text("Items $it", Modifier.padding(8.dp))
        }
    }
}